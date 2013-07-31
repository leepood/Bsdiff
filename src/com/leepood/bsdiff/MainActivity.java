package com.leepood.bsdiff;

import com.leepood.bsdiff.tools.PatchTools;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		PatchTools.applay_patch("/mnt/sdcard/reader3.apk", "/mnt/sdcard/newreader.apk", 
				"/mnt/sdcard/ireader.p");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
