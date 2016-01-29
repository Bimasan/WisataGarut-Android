package com.wisatagarut;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Menu extends Activity implements OnClickListener {
	Button buttongarut, buttonwisata, buttonabout, buttonexit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		buttongarut = (Button) findViewById(R.id.buttongarut);
		buttongarut.setOnClickListener(this);
		buttonwisata = (Button) findViewById(R.id.buttonwisata);
		buttonwisata.setOnClickListener(this);
		buttonabout = (Button) findViewById(R.id.buttonabout);
		buttonabout.setOnClickListener(this);
		buttonexit = (Button) findViewById(R.id.buttonexit);
		buttonexit.setOnClickListener(this);
		
		

		buttongarut.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View V) {
				// getRequest(txtResult,txtUrl);
				CallIntent(V);
			}
		});
		buttonwisata.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View V) {
				// getRequest(txtResult,txtUrl);
				CallIntent(V);
			}
		});
		buttonabout.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View V) {
				// getRequest(txtResult,txtUrl);
				CallIntent(V);
			}
		});
		buttonexit.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View V) {
				// getRequest(txtResult,txtUrl);
				CallIntent(V);
			}
			});
			
	}

	public void CallIntent(View view) {
		Intent intent = null;
		switch (view.getId()) {
		case R.id.buttongarut:
			intent = new Intent(this, Garut.class);
			startActivity(intent);
			break;
		case R.id.buttonwisata:
			intent = new Intent(this, Wisata.class);
			startActivity(intent);
			break;
		case R.id.buttonabout:
			AlertDialog.Builder info = new AlertDialog.Builder(
					Menu.this);
			info.setMessage("Aplikasi ini berguna untuk mencari\ninformasi wisata yang ada di Garut.\n\nVersion 1.0")
					.setCancelable(false)
					.setPositiveButton("Lanjut",
							new AlertDialog.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface arg0,
										int arg1) {
									// TODO Auto-generated method stub

								}
							});
			AlertDialog dialog = info.create();
			dialog.setTitle("About");
			dialog.show();
			TextView textView = (TextView) dialog
					.findViewById(android.R.id.message);
			textView.setTextSize(15);
			break;
	case R.id.buttonexit:
			AlertDialog.Builder keluar = new AlertDialog.Builder(
					Menu.this);
			keluar.setMessage("Anda yakin ingin keluar?")
					.setCancelable(false)
					.setPositiveButton("Ya", new AlertDialog.OnClickListener() {
						public void onClick(DialogInterface arg0, int arg1) {
							Intent exit = new Intent(Intent.ACTION_MAIN);
							exit.addCategory(Intent.CATEGORY_HOME);
							exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
							startActivity(exit);
						}
					})
					.setNegativeButton("Tidak",
							new AlertDialog.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int arg1) {
									dialog.cancel();
								}
							});
			AlertDialog dialog1 = keluar.create();
			dialog1.setTitle("Exit");
			dialog1.show();
		}

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

	}

}


