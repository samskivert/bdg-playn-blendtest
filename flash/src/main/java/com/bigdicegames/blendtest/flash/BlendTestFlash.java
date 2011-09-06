package com.bigdicegames.blendtest.flash;

import playn.core.PlayN;
import playn.flash.FlashGame;
import playn.flash.FlashPlatform;

import com.bigdicegames.blendtest.core.BlendTest;

public class BlendTestFlash extends FlashGame {

  @Override
  public void start() {
    FlashPlatform platform = FlashPlatform.register();
    platform.assetManager().setPathPrefix("blendtestflash/");
    PlayN.run(new BlendTest());
  }
}
