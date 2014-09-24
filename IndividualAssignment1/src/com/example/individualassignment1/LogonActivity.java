package com.example.individualassignment1;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogonActivity extends Activity {

	EditText nameInput;
	TextView nameOutput;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.logon);
		nameInput = (EditText)findViewById(R.id.txtName);
	}

	public void btnBackClicked(View view){
		setContentView(R.layout.logon);
		nameInput = (EditText)findViewById(R.id.txtName);
	}

	public void btnEnterClicked(View view){	
		
		String enteredName = nameInput.getText().toString();
		if(!enteredName.equals("Enter name here") && !enteredName.equals("") && !enteredName.equals(" "))
		{
			setContentView(R.layout.conformation);
			nameOutput=(TextView)findViewById(R.id.lblConformation);
			//setContentView(R.layout.logon);
			nameOutput.setText("Hello " + nameInput.getText().toString());
		}
		else
		{
			Toast.makeText(getApplicationContext(),
			"Please enter your name", Toast.LENGTH_LONG).show();
		}
	
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.logon, menu);
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
