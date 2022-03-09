package com.cg.day3;

class FinalDemo {
    // create a final method
    public void display() {
      System.out.println("This is a final method.");
    }
}


public class MyClass extends FinalDemo {
    public final void display() {
    System.out.println("The final method is overridden.");
  }
    final int DAYS_IN_WEEK;
  {
        DAYS_IN_WEEK = 7;
    }

    public static void main(String args[]) {
      
        MyClass obj = new MyClass();
        System.out.println(obj.DAYS_IN_WEEK);
        obj.display();
    }
}
