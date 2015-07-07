package com.incture.inc_assign;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText text1=(EditText) findViewById(R.id.textfield1);
		final EditText text2=(EditText) findViewById(R.id.textfield2);
		final EditText text3=(EditText) findViewById(R.id.textfield3);
		Button button1=(Button)findViewById(R.id.Button1);
		Button button2=(Button)findViewById(R.id.Button2);
		Button button3=(Button)findViewById(R.id.Button3);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text2.setText(text1.getText().toString());
				text1.setText("");
			}
		});
button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				text3.setText(text2.getText().toString());
				text2.setText("");
			}
		});
button3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		text1.setText(text3.getText().toString());
		text3.setText("");
	}
});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
