package com.cg;

public class NestedMethod {
	static int x = 1;
	private int y = 3;
	public void method1(int x)
	{
		NestedMethod t = new NestedMethod();
		this.x = 2;
		y = 4;

		System.out.println("NestedMethod.x: " + NestedMethod.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
	}

	public static void main(String args[])
	{
		NestedMethod t = new NestedMethod();
		t.method1(5);
	}


}
