package com.zajecia3;

import java.awt.Color;
import java.awt.Shape;

public interface IMyDrawableShape
{
	Shape getAwtShape(int width, int height);

	Color getColor();
}
