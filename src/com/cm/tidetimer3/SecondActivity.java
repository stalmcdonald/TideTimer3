/*
 * Crystal McDonald
 * Java II
 * 1308
 * Week 3
 */
package com.cm.tidetimer3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements OnClickListener {
	Button goTide;
	Button browse;
	EditText cityEntered;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tide);
		cityEntered = (EditText)findViewById(R.id.cityText);
		goTide = (Button)findViewById(R.id.tideButton);
		
		//set listener for browser button
		browse = (Button)findViewById(R.id.webButton);
		
		goTide.setOnClickListener(this);
		
		//Implicit Intent
		browse.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View interwebs) {
			// sends user to site that shows more information on forecast
			Uri uriUrl = Uri.parse("http://www.wunderground.com/");
			
			Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
			
			startActivity(browse_intent);
			
		}
	});

	

}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}