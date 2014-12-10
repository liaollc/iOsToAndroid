package com.pdachoice.slidingmenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class ScreenOneFragment extends Fragment implements OnClickListener {
  private View contentView;
//  private View nextButton;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    contentView = inflater.inflate(R.layout.screenone_fragment, container,
        false);
    
    return contentView;
  }
  
  // provide the interface implementation
  @Override
  public void onClick(View v) {
     // Step E: delegate to MainActivity
     ScreenTwoFragment frag = new ScreenTwoFragment();
     ((MainActivity) getActivity()).pushViewController(frag, true);
  }
}