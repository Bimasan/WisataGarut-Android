package com.wisatagarut;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.Activity;
import android .widget.AdapterView;

public class Wisata extends Activity {
	ListView listviewwisata;
	String[] daftarwisata = new String[] { "Situ Bagendit","Cijeruk Indah", "Cipanas",
			"Curug Orok", "Puncak Guha","Kawah Papandayan",
			"Karang Paranje","Sampiren","Rancabuaya" };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wisata);
		listviewwisata = (ListView) findViewById(R.id.listviewwisata);
		
		//Isi ListView
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, daftarwisata);
		listviewwisata.setAdapter(adapter);
		listviewwisata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			
			public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
				  if (position == 0){
					Intent int0 = new Intent(getApplicationContext(),Bagendit.class);
					startActivity(int0);
				  }
				  
				else if (position == 1){
						Intent int0 = new Intent(getApplicationContext(),Cijeruk.class);
						startActivity(int0);
					  }
				  
				  else if (position == 2){
						Intent int0 = new Intent(getApplicationContext(),Cipanas.class);
						startActivity(int0);
					  }
				  
				  else if (position == 3){
						Intent int0 = new Intent(getApplicationContext(),Curug.class);
						startActivity(int0);
					  }
				  
				  else if (position == 4){
						Intent int0 = new Intent(getApplicationContext(),Guha.class);
						startActivity(int0);
					  }

				  else if (position == 5){
						Intent int0 = new Intent(getApplicationContext(),Papandayan.class);
						startActivity(int0);
						
					  }

				  else if (position == 6){
						Intent int0 = new Intent(getApplicationContext(),Paranje.class);
						startActivity(int0);
						
					  }

				  else if (position == 7){
						Intent int0 = new Intent(getApplicationContext(),Sampiren.class);
						startActivity(int0);
						
					  }
				
				  else if (position == 8){
						Intent int0 = new Intent(getApplicationContext(),Ranca.class);
						startActivity(int0);
						
					  }
				
				  
				  
				 
		};
	}
		);
	{

	}

}}

