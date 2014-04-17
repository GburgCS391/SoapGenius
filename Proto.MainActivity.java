// Source: http://code.google.com/p/android-animation-example/downloads/detail?name=AnimationExample.zip&can=2&q= 
package edu.gettysburg.cs391.soapproto;


import java.util.ArrayList;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity {
	/**
	 * Reference to the ImageView which will display the animation.
	 */

	private static final String SOAPOIL_INPUT = "soapoil.txt";
	ImageView animation;
	private Button bncrtsoap, tutor;
	private ArrayList<Ingredient> inList;
	private SharedPreferences prefs = null;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		loadSoapOil();
		bncrtsoap = (Button) findViewById(R.id.crtsoap);
		tutor = (Button) findViewById(R.id.button3);

		bncrtsoap.setOnClickListener(new OnClickListener(){

			public void onClick(View v){
				openPageOne();
			}
		});     
		tutor.setOnClickListener(new OnClickListener(){

			public void onClick(View v){
				tutorial();
			}
		}); 


	}

	public ArrayList<Ingredient> loadSoapOil(){
		//store only the non-calculated pieces in the database
		//when we load in from the database we will calculate hardness/other things
		return inList;

	}

	public void tutorial(){

		Intent intent = new Intent(MainActivity.this, TutorialOpening.class);
		startActivity(intent);
	}

	public void openPageOne(){

		final Dialog dialog = new Dialog(this);
		dialog.setContentView(R.layout.createsoap_page1);
		dialog.setTitle("New Soap");

		Button bncancel = (Button) dialog.findViewById(R.id.cancel);
		Button bnNext = (Button) dialog.findViewById(R.id.button2);

		bncancel.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}    		
		});
		bnNext.setOnClickListener(new OnClickListener(){

			public void onClick(View v){
				openPageTwo();
			}
		});
		dialog.show();
	}

	public void openPageTwo(){

		final Dialog dialog = new Dialog(this);
		dialog.setContentView(R.layout.createsoap_page2);
		dialog.setTitle("New Soap");

		Button bncancel = (Button) dialog.findViewById(R.id.button1);
		Button bnNext = (Button) dialog.findViewById(R.id.button2);

		bnNext.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				toNewRecipe();
				//record all the selections made in each dialog 
				dialog.dismiss();
			}

		});

		bncancel.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}    		
		});


		dialog.show();
	}

	private void toNewRecipe()
	{
		Intent intent = new Intent(this, IngredientAct.class);
		startActivity(intent);
	}


	/**
	 * Working on automated "first time" tutorial start
	 * 
	 SharedPreferences prefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Perhaps set content view here

        prefs = getSharedPreferences("com.mycompany.myAppName", MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (prefs.getBoolean("firstrun", true)) {
            // Do first run stuff here then set 'firstrun' as false
            // using the following line to edit/commit prefs
            prefs.edit().putBoolean("firstrun", false).commit();
        }
    }


	 */

	/* ********************************************************************************************************** */
	/**This is all animation code, do not delete but please leave alone. 
	 * 
	 * public class Loader extends ImageView {
    public Loader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    public Loader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public Loader(Context context) {
        super(context);
        init();
    }
    private void init() {
        setBackgroundResource(R.drawable.animation);
        final AnimationDrawable frameAnimation = (AnimationDrawable) getBackground();
        post(new Runnable(){
            public void run(){
                 frameAnimation.start();
             }
        });
    }
}
	 * 
	 * 
	 * 	private Drawable draw;
	 * 
	 * animation = (ImageView)findViewById(R.id.imageAnimation);
		draw = getResources().getDrawable( R.drawable.animation);
		draw.setAlpha(R.drawable.animation);

		animation.setBackgroundDrawable(draw); // the frame-by-frame animation defined as a xml file within the drawable folder
	 * 
	 * @Override
	public void onWindowFocusChanged (boolean hasFocus) {
		super.onWindowFocusChanged(hasFocus);
		AnimationDrawable frameAnimation = 
				(AnimationDrawable) animation.getBackground();
		if(hasFocus) {
			frameAnimation.start();

		} else {
			frameAnimation.stop();
		}
	}
	 */
}
