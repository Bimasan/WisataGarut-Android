package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Curug extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_curug);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.co1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.co2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.co3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.co4);
			}
		});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.co5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Kenapa disebut curug orok? curug orok  dalam artian bahasa sunda bisa diartikan sebagai air terjun bayi," +
				"cerita masyarakat yang mempercayai bahwa dahulu kala ada seorang ibu yang membuang  " +
				"bayinya di air terjun tersebut,curug yang berlokasikan di desa Cikandang Kabupaten Garut ini adalah  " +
				"tempat wisata air terjun yang mempunyai ketinggian kurang lebih 45 meter,banyak juga wisatawan dari " +
				"luar kota yang ingin menikmati pemandangan di curug orok ini.";


		penj.setText(penjelasan);
		
		
	}


}


	
