package com.bigdicegames.blendtest.java;

import com.bigdicegames.blendtest.core.BlendTest;

import playn.core.PlayN;
import playn.java.JavaAssetManager;
import playn.java.JavaPlatform;

public class BlendTestJava {
	public static void main(String[] args) {
		JavaAssetManager assets = JavaPlatform.register().assetManager();
		assets.setPathPrefix("src/main/java/com/bigdicegames/blendtest/resources");
		PlayN.run(new BlendTest());
	}
}
