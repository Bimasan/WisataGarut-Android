package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Cipanas extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cipanas);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.cp1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.cp2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.cp3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.cp4);
	}
});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.cp5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Kenapa dinamakan cipanas? cipanas kalau orang garut bilang itu artinya adalah air yang panas,jadi " +
				"pemandian air panas ini sudah akrab dinamakan cipanas sampai sekarang,Cipanas adalah sumber " +
				"pemandian air panas yang terkenal yang terletak di sekitar 6 Km dari kota Garut dan 50 Km dari kota " +
				"Bandung,pemandian air panas ini sangat terkenal bahkan kerap dikunjungi wisatawan dari luar "  +
				"kota,karena pemandian air panas ini mengandung banyak unsur mineral yang sangat baik bagi " +
				"kesehatan jasmani.";

penj.setText(penjelasan);
		
		}

}


	
