/*
 * Crystal McDonald
 * Java II
 * 1308
 * Week 3
 */

package com.cm.tidetimer3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	Button city, predict;
	TextView tidalPrediction;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		city = (Button) findViewById(R.id.cButton);
		predict = (Button) findViewById(R.id.pButton);
		tidalPrediction = (TextView) findViewById(R.id.textPrediction);
		
		//setup onclick Listener
		city.setOnClickListener(this);
		predict.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	//Explicit Intent
	@Override
	public void onClick(View v) {
		// if city button pressed go to new activity
		Intent i = new Intent(this, SecondActivity.class);
		i.putExtra("cityEnter", "city");
		startActivity(i);
		//Log.i("Entered:", city);
		//Add City to url
		//String baseURL =  "http://api.wunderground.com/api/3e64fa36c4f09bdd/tide/q/FL/"+cities+".json" 
		//string myCity = 
		
	}
	
	//Retrieves state from second activity to be added to url
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		super.onActivityResult(requestCode, resultCode, data);
		if(data.getExtras().containsKey("enteredInfo")){
			city.setText(data.getStringExtra("enteredInfo"));
		}
	}

}//end
