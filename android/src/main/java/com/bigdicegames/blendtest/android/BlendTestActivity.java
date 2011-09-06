package com.bigdicegames.blendtest.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.bigdicegames.blendtest.core.BlendTest;

public class BlendTestActivity extends GameActivity {

  @Override
  public void main(){
    platform().assetManager().setPathPrefix("com/bigdicegames/blendtest/resources");
    PlayN.run(new BlendTest());
  }
}
