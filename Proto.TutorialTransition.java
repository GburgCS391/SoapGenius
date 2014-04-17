package edu.gettysburg.cs391.soapproto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.ProgressBar;




public class StepTwo extends Activity {

	private static final int ACTION_STATE = 25;
	private float mx1, mx2, my1, my2;
	private ProgressBar pBar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.steptwo);
		pBar = (ProgressBar) findViewById(R.id.progressBar1); 
		pBar.setProgress(ACTION_STATE);
	} 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public boolean onTouchEvent(MotionEvent e){
		switch (e.getAction()){
		case MotionEvent.ACTION_DOWN:
			mx1 = e.getX();
			my1 = e.getY();

			break;
		case MotionEvent.ACTION_UP:
			mx2 = e.getX();
			my2 = e.getY();
			if(mx2 > mx1){ finish();}


			if(mx2 < mx1) {
				Intent intent =new Intent(StepTwo.this, StepThree.class);
				startActivity(intent);
			}
			break; 
		}
		return false;
	}




}
