package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Garut extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_garut);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
	
		
	
		
		
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.grt1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.grt2);
			}
		});
		
	
	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "Kabupaten Garut, adalah sebuah Kabupaten di Provinsi Jawa Barat, Indonesia. Ibukotanya adalah " +
				"Tarogong Kidul. Kabupaten ini berbatasan dengan Kabupaten Sumedang di utara," +
				" Kabupaten Tasikmalaya di timur, Samudera Hindia di selatan, serta Kabupaten Cianjur dan Kabupaten Bandung di barat.";


		penj.setText(penjelasan);
		
		
	}


}


	
