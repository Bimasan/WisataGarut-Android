package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Bagendit extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bagendit);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.bg1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.bg2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.bg3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.bg4);
	}
});

		image5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.bg5);
	}
});

;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Situ Bagendit terletak di desa Bagendit, Kecamatan Banyuresmi Kabupaten Garut, Jawa Barat, Indonesia." +
				"Situ Bagendit merupakan objek wisata alam berupa danau dengan batas administrasi disebelah utara berbatasan  " +
				"dengan Desa Banyuresmi, disebelah selatan berbatasan dengan Desa Cipicung," +
				"disebelah timur berbatasan dengan Desa Binakarya, dan disebelah barat berbatasan dengan Desa Sukamukti." +
				"	Aktivitas wisata yang dapat dilakukan di Situ Bagendit ini antara lain menikmati pemandangan" +
				"mengelilingi danau dengan menggunakan perahu atau rakit. Para pengunjung juga dapat " +
				"melakukan kegiatan rekreasi keluarga, menikmati pemandangan serta kegiatan bersepeda air.";


		penj.setText(penjelasan);
		
		
	}


}


	
