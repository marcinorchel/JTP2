package com.zajecia3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyShapeDrawer extends JPanel
{
	private final List<IMyDrawableShape> myShapes;

	public MyShapeDrawer(List<IMyDrawableShape> myShapes)
	{
		this.myShapes = myShapes;
	}

	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Dimension size = this.getSize();
		for (IMyDrawableShape myShape : myShapes)
		{
			g.setColor(myShape.getColor());
			((Graphics2D) g).draw(myShape.getAwtShape(size.width, size.height));
		}
	}

	public static void main(String[] args)
	{
		Pentagon pentagon = new Pentagon(Color.RED);
		List<IMyDrawableShape> myShapes = new ArrayList<>();
		myShapes.add(pentagon);
		MyShapeDrawer drawer = new MyShapeDrawer(myShapes);
		JFrame frame = new JFrame();
		frame.setTitle("Draw");
		frame.getContentPane().add(drawer);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
