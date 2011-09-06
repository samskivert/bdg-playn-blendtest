package com.bigdicegames.blendtest.core.shapes;

import com.bigdicegames.blendtest.core.GraphicsUtil;

import playn.core.Canvas;

public class RectangleShape extends Shape {
	public RectangleShape() {
		Canvas canvas = canvasImage.canvas();
		canvas.setFillColor(GraphicsUtil.RGB(0, 0, 0xff));
		canvas.fillRect(SHAPE_WIDTH*.10f, 0, SHAPE_WIDTH*.55f, SHAPE_WIDTH*.55f);
	}
}
