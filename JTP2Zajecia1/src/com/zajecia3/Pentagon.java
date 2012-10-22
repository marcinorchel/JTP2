package com.zajecia3;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;

public class Pentagon extends MyShape
{
	public Pentagon(Color color)
	{
		super(color);
	}

	@Override
	public Shape getAwtShape(int width, int height)
	{
		Polygon polygon = new Polygon();
		for (int i = 0; i < 5; i++)
		{
			polygon.addPoint((int) (300 + 100 * Math.cos(i * 2 * Math.PI / 5)),
					(int) (300 + 100 * Math.sin(i * 2 * Math.PI / 5)));
		}
		return polygon;
	}
}
