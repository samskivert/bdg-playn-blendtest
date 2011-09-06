package com.bigdicegames.blendtest.html;

import com.bigdicegames.blendtest.core.BlendTest;

import playn.core.PlayN;
import playn.html.HtmlAssetManager;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

public class BlendTestHtml extends HtmlGame {
	@Override
	public void start() {
		HtmlAssetManager assets = HtmlPlatform.register().assetManager();
		assets.setPathPrefix("blendtest/");
		PlayN.run(new BlendTest());
	}
}
