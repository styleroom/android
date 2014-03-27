package com.example.aphorism;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	/*
	  Resources res = getResources();
	  String[] data = res.getStringArray(R.array.labels);
	  */
	  
	  GridView gvMain;
	  ArrayAdapter<String> adapter;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		  Resources res = getResources();
		  String[] data = res.getStringArray(R.array.labels);		
		
        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gridView1);
        gvMain.setAdapter(adapter);
        adjustGridView();		
	}

	private void adjustGridView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
