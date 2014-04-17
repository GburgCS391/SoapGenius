package edu.gettysburg.cs391.soapproto;
//team project
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class StepFinal extends Activity {

	private static final int ACTION_STATE = 100;
	private float mx1, mx2, my1, my2;
	private ProgressBar pBar;
	private Button btnF;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stepfinal);
		pBar = (ProgressBar) findViewById(R.id.progressBar1); 
		pBar.setProgress(ACTION_STATE);
		btnF = (Button) findViewById(R.id.advntre);

		btnF.setOnClickListener(new OnClickListener(){

			public void onClick(View v){ 
				Intent intent = new Intent(StepFinal.this, MainActivity.class);
				startActivity(intent);
				
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
