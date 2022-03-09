package com.cg.day3;

class SayHello{
	int val_a,val_b;
	public SayHello(){
		this.val_a=10;
		this.val_b=20;
	}
	SayHello get() {
		return this;
	}
	void display()
    {
         System.out.println("val_a = " + val_a + "  val_b = " + val_b);
    }
}

public class Hello {
	public static void main(String[] args) {
		SayHello object = new SayHello();
        System.out.println(object.get().val_b);
        
    }

}
