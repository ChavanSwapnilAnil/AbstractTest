package com.swap;

abstract class Shape
{
	
	void drow () {
		
	}
	
}

class Rectangle extends Shape 
{
 void drow ()
{
	System.out.println("drawing rectangle");
}
}

class Circel1 extends Shape
{
	void drow ()
	{
		System.out.println("drawing circel");
	}
}
public class TestAbstraction1 
{
public static void main(String[] args)
{
	Shape s = new Circel1();
	s.drow();

	}

}
