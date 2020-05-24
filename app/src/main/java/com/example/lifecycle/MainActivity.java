package com.example.lifecycle;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i("MainActivity", "onCreate()");
	}

    @Override
    protected void onStart() {
    	super.onStart();
    	Log.i("MainActivity", "onStart()");
    }
    
    @Override
    protected void onResume() {
    	super.onResume();
    	Log.i("MainActivity", "onResume()");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.i("MainActivity", "onRestart()");
    	
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.i("MainActivity", "onPause()");
    }
    
    @Override
    protected void onStop() {
    	super.onStop();
    	Log.i("MainActivity", "onStop()");
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	Log.i("MainActivity", "onDestroy()");
    }	

    
    public void start2nd(View view) {
    	Intent intent = new Intent(this, SecondaryActivity.class);
    	intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    	startActivity(intent);	
    }
    
}
