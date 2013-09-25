package com.pangff;

import rajawali.RajawaliFragment;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

@SuppressLint("NewApi")
public class LoadModelFragment extends RajawaliFragment {

	private MyRenderer myRenderer;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		myRenderer = new MyRenderer(this.getActivity());
		myRenderer.setSurfaceView(mSurfaceView);
		super.setRenderer(myRenderer);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		mLayout = (FrameLayout) inflater.inflate(R.layout.rajawali_fragment,
				container, false);

		mLayout.addView(mSurfaceView);
		return mLayout;
	}
}
