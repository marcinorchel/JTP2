package com.zajecia3;

import java.awt.Color;

public abstract class MyShape implements IMyShape
{
	private final Color color;

	public MyShape(Color color)
	{
		this.color = color;
	}

	@Override
	public Color getColor()
	{
		return color;
	}

}
