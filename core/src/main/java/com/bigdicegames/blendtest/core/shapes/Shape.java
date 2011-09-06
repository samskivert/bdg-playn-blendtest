package com.bigdicegames.blendtest.core.shapes;

import static playn.core.PlayN.graphics;
import playn.core.CanvasImage;
import playn.core.Image;

public class Shape {
	public static int SHAPE_WIDTH = 50; 
	public static int SHAPE_HEIGHT = 50;
	protected CanvasImage canvasImage;
	
	public Shape() {
		canvasImage = graphics().createImage(SHAPE_WIDTH, SHAPE_HEIGHT);
	}
	
	public Image getImage() {
		return canvasImage;
	}
}
