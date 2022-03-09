package com.cg.day3;
class Animal{
	String name;
	public Animal(String name) {
		this.name=name;
		
	}
	  public void display(){
		    System.out.println("I am an animal");
		  }

	
}
class Dog extends Animal{
	String breed;
	public Dog(String breed,String name) {
		super(name);
		this.breed=breed;
		
	}
	@Override
	 public void display(){
		super.display();
		System.out.println(name);
		System.out.println(breed);
		  }
	public void printMessage() {
		display();
	}

}

public class AnimalDriver {
	public static void main(String[] args) {
	    Dog dog1 = new Dog("LongHorn","Dog");
	    dog1.printMessage();


}
}
