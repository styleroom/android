package com.example.mikophone;

import android.os.Bundle;
import android.webkit.WebView;
import android.app.Activity;
//import android.view.Menu;

public class PageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page);
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		//myWebView.loadDataWithBaseURL("file:///android_res/raw/n3.html", null, "text/html", "utf-8",null);
		myWebView.loadUrl("file:///android_res/raw/n"+MainActivity.str+".html");		
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.page, menu);
		return true;
	}
	*/

}
