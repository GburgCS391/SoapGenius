package edu.gettysburg.cs391.soapproto;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class IngredientAct extends Activity {

	
	private ArrayList<Ingredient> ingredList;
	private Button hm;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ingredient);
		
		int[] ints = getResources().getIntArray(R.array.TestThingys);
		
		ListView listView = (ListView) findViewById(R.id.listView1);
		hm = (Button) findViewById(R.id.home);
		hm.setOnClickListener(new OnClickListener(){

 			public void onClick(View v){
 				Intent intent = new Intent(IngredientAct.this, MainActivity.class);
 				startActivity(intent);
 			}
 		});
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		
		for(int i: ints)
		{
			integers.add(i);
		}
		
		listView.setAdapter(new ArrayAdapter<Integer>(this,
				android.R.layout.simple_list_item_1, integers));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ingredient, menu);
		return true;
	}

}
