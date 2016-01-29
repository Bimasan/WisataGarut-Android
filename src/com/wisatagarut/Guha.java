package com.wisatagarut;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Guha extends Activity {
	ImageView display;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guha);
		
		display = (ImageView)findViewById(R.id.imageViewDisplay);
		ImageView image1 = (ImageView)findViewById(R.id.imageView1);
		ImageView image2 = (ImageView)findViewById(R.id.imageView2);
		ImageView image3 = (ImageView)findViewById(R.id.imageView3);
		ImageView image4 = (ImageView)findViewById(R.id.imageView4);
		ImageView image5 = (ImageView)findViewById(R.id.imageView5);
		
		
	
		image1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				display.setImageResource(R.drawable.pg1);
				
			}
		});
		
		image2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.pg2);
			}
		});
		
		image3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				display.setImageResource(R.drawable.pg3);
			}
});
		
		image4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {

		display.setImageResource(R.drawable.pg4);
	}
});
		image5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {

				display.setImageResource(R.drawable.pg5);
			}
		});

	
;
		final TextView penj = (TextView)findViewById(R.id.textViewPenjelasan);
		String penjelasan = "	Puncak Guha merupakan semenanjung kecil berupa tebing yang dibawahnya ada Guha tempat " +
				"kelelawar hidup yang menghadap langsung ke samudra hindia. Pertama kali menginjakan kaki  " +
				"ditempat ini, suasana begitu enak untuk dinikmati. Ada keheningan dan ketenangan sesampainya  " +
				"di Puncak Guha ini. Lautan yang Luas, Angin laut yang kencang, Pesisir pantai yang Eksotis,  " +
				"tebing yang curam dgn ombak yg besar." +
				"	Salah satu yang membuat penasaran yaitu Puncak Guha. Wisata Puncak Guha secara administratif " +
				"berada di Desa Sinarjaya kecamatan Bungbulang, Kab. Garut dan dekat kawasan wisata Rancabuaya. " +
				"Bahkan orang lebih mengenalnya dengan Rancabuaya. Padahal Rancabuaya dibelakang ujung pantai ini " +
				"disebelah barat. Jarak ke Rancabuaya kira-kira 3 km-an." ;


		penj.setText(penjelasan);
		
		
	}


}


	
