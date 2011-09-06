package com.bigdicegames.blendtest.core.shapes;

import static playn.core.PlayN.assetManager;
import static playn.core.PlayN.graphics;

import com.bigdicegames.blendtest.core.GraphicsUtil;

import playn.core.Canvas;
import playn.core.Image;
import playn.core.ResourceCallback;

public class ImgTextShape extends Shape {
	public ImgTextShape(final ResourceCallback<Image> parentCallback) {
	    Image image = assetManager().getImage("images/imgtext.png");
	    image.addCallback(new ResourceCallback<Image>() {
			@Override
			public void done(Image resource) {
				Canvas canvas = canvasImage.canvas();
				canvas.drawImage(resource, 0, 0);
				parentCallback.done(resource);
			}

			@Override
			public void error(Throwable err) {
				parentCallback.error(err);
			}} );
	}
}
