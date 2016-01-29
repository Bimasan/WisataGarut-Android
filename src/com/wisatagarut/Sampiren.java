package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Sampiren extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sampiren);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.sa1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.sa2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.sa3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.sa4);
	}
});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.sa5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Kampung Sampireun Hotel Garut adalah sebuah resor beralamat di Jl.Raya Samarang " +
				"Kamojang, Kampung Ciparay desa Sukakarya Kecamatan Samarang Kabupaten Garut, Jawa Barat " +
				"dengan bernuansa perkampungan Sunda dalam area seluas 5,5 hektaree berikut danau, " +
				"didalamnya Situ Sampireun seluas 1,5 Hektar yang berada pada ketinggian ± 1.000 meter di atas permukaan laut.";


		penj.setText(penjelasan);
		
		}

}


	
