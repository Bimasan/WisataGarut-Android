package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Papandayan extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_papandayan);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.kp1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.kp2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.kp3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.kp4);
	}
});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.kp5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Di daerah garut jawa barat ada banyak gunung api yang terkenal,diantaranya adalah Gunung " +
				"Papandayan,gunung ini berlokasikan di Kecamatan Cisurupan Garut Jawa Barat,dan guung papandayan " +
				"ini hanya berjarakan sekitar 70 Km langsung dari kota bandung,sehingga banyak warga bandung yang " +
				"hendak berwisata ke gunung papandayan garut ini,keunggulan dari gunung papandayan ini tidak lain " +
				"adalah kawah dan air panasnya,tetapi selain itu banyak wisatawan yang sengaja pergi ke gunung "+
				"papandayan hanya untuk dapat menyaksikan panorama matahari terbit langgsung dari gunung ini.";


		penj.setText(penjelasan);
		
		
	}


}


	
