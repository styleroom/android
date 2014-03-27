package com.example.apho_01;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	public static String loadPage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// todo
	}
	
	public void onClick(View v) {
		
		Button btn = (Button)findViewById( v.getId() );
		int id = btn.getId();
		
		Intent intent = new Intent(MainActivity.this, PageActivity.class);
	    		
		
	    switch (id) {
	        case R.id.butt1:
	        {
	        	loadPage = "butt1";        	
	        }
	            break;
	        case R.id.butt2:
	        {
	        	loadPage = "butt2";        	
	        }
	            break;
	        case R.id.butt3:
	        {
	        	loadPage = "butt3";        	
	        }
	            break;
	        case R.id.butt4:
	        {
	        	loadPage = "butt4";        	
	        }
	            break;
	        case R.id.butt5:
	        {
	        	loadPage = "butt5";        	
	        }
	            break;
	        case R.id.butt6:
	        {
	        	loadPage = "butt6";        	
	        }
	            break;            
	    }
	    
	    startActivity(intent);
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
