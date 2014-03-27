package com.example.mikophone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.AdapterView;
//import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity {
	
	public static String str;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        Resources res = getResources();
        String[] catnames = res.getStringArray(R.array.web_pages);         
        
    	final ListView lv = (ListView)findViewById(R.id.listView1);
    	
    	ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, 
    			R.layout.list_item, catnames);
        
    	lv.setAdapter(adapter);	
    	lv.setClickable(true);
    	lv.setOnItemClickListener(new OnItemClickListener() 
    	{
    		public void onItemClick(AdapterView<?> a, View v, int position, long id) 
    		{
    			MainActivity.str = new Integer(position).toString();
    			Intent myIntent = new Intent(MainActivity.this, PageActivity.class);
                startActivityForResult(myIntent, 0);
    		 }
    	});    	
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	*/

}
