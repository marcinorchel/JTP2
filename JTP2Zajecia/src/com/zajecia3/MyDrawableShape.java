package com.zajecia3;

import java.awt.Color;

public abstract class MyDrawableShape implements IMyDrawableShape
{
	private final Color color;

	public MyDrawableShape(Color color)
	{
		this.color = color;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

}
