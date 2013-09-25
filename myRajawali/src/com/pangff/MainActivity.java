package com.pangff;

import rajawali.RajawaliActivity;
import android.annotation.SuppressLint;
import android.app.FragmentTransaction;
import android.os.Bundle;

@SuppressLint("NewApi")
public class MainActivity extends RajawaliActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);
		
		LoadModelFragment fragment = new LoadModelFragment();

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.rootView, fragment);
        transaction.commit();
	}

}
