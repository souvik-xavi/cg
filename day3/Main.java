package com.cg.day3;
class Static_B
{
    int x = 10;
 
    Static_B()
    {
          Static_A obj = new Static_A(this);
    }
 
    void display()
    {
          System.out.println("B::x = " + x);
    }
}

class Static_A
{
     Static_B obj2;
 
     Static_A(Static_B obj1)
    {
        this.obj2 = obj1;
 
        obj2.display();
    }
 }
 

 
class Main{
     public static void main(String[] args) {
        Static_B obj = new Static_B();
    }
}
