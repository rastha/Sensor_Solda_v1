package com.rastha.sensor_solda_v1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.app.Activity;

public class MainActivity extends ActionBarActivity {
	
	// Process Spinner control Variables.
	private ProgressBar spinner;
	int att = 1;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
       spinner = (ProgressBar)findViewById(R.id.progressBar1);
       spinner.setVisibility(View.GONE);
       
    }
    
    
    // Change the state of spinner using as control the button "Ler".
    public void abrindo(View view){
    	
    	switch (att){
    	
    	case 1:
    		spinner.setVisibility(View.VISIBLE);
    		att = 2;
    	break;	
    	case 2:
    		spinner.setVisibility(View.GONE);
    		att = 1;
    	break;
    	
    	}
    }
    
    public void readwebserver(View view){
    	
    	
    	
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
