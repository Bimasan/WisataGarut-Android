package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Cijeruk extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cijeruk);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.cj1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.cj2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.cj3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.cj4);
	}
});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Dan untuk pantai cijeruk indah yang berlokasikan tepat di Desa Sagara ini adalah termasuk pantai yang " +
				"bukan lumayan lagi indahnya, bahkan pantai ini sangatlah menarik untuk dikunjungi para " +
				"wisatawan, pantai Cijeruk indah mempunyai beberapa keunggulan diantaranya : tidak terlalu ramai  " +
				"pengunjung jadi lingkunganya bersih daan juga mempunyai kualitas air yang sangatlah jernih."  ;


		penj.setText(penjelasan);
		
		
	}


}


	
