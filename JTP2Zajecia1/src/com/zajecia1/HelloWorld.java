package com.zajecia1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld
{
	private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

	private static void foo()
	{
		foo();
	}

	public static void main(String[] args)
	{
		logger.info("Hello world");
		Object table = new int[20];
		foo();
	}
}
