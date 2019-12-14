package com.swap;

 
abstract class Bike
{
	abstract void run ();
	
}

class Honda4 extends Bike 
{
	void run ()
	{
		System.out.println("runing safely");
		System.out.println("runing safely1");
	}
	public static void main(String[] args) 
	{
		Honda4 obj = new Honda4();
		obj.run();
	}
}