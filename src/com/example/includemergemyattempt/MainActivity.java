package com.example.includemergemyattempt;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btnGONextActivity).setOnClickListener(
				new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						startActivity(new Intent(MainActivity.this,
								NextActivity.class));
					}
				});
	}

}
