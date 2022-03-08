package com.cg;
class Fruit{}
class Vehicle{}
class A{}
class B extends A{}


public class InstanceOfDemo {
	public static void main(String[] args)
	{
		Fruit pineapple = new Fruit();
		Vehicle truck = new Vehicle();
		A objOfClassB = new B();
		Vehicle car = null;
		
		System.out.println("pineapple IS A fruit: " + (pineapple instanceof Fruit));
		System.out.println("truck IS A vehicle: " + (truck instanceof Vehicle));
		System.out.println("Car IS A vehicle: " + (car instanceof Vehicle));
		System.out.println("objOfClassB is an instance of B: " + (objOfClassB instanceof B));
		System.out.println("objOfClassB is an instance of the parent class A: " + (objOfClassB instanceof A));	

	}

}


