package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Paranje extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_paranje);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.pkp1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.pkp2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.pkp3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.pkp4);
	}
});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.pkp5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Nah ini dia pantai karang paranje,Pantai ini berlokasi di Kecamatan Cibalong Kabupaten Garut,Pantai " +
				"Karang Paranje memiliki beberapa keunggulann diantaranya, adanya bekas gugusan karang di sepanjang  " +
				"pantai tersebut,pantai ini berluaskan sekitar 9 hektar yang dapat anda nikmati  " +
				"pemandanganya,terutama bila saat matahari mulai terbenam,anda sebaiknya jangan melewatkan  " +
				"moment tersebut,suasana yang nyaman dan asripun akan anda dapatkan karena pantai disini belum  "+
				"tercampur oleh berbagai jenis bangunan dan pencemaran lingkungan.";


		penj.setText(penjelasan);
		
		
	}


}


	
