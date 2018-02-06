package com.bellinfo.Assign2;

public class Question4 {

	public static void main(String[] args) {
    //Multiply.Multiply();
		
    A aObj = new A();
    aObj.Multiply();
    aObj.Mul();
  
    
    
	}

}

abstract class Multiply {
	
	static void Multiply(){
		int a = 10;
		int b = 10;
		int c = a*b;
		System.out.println(+   c   +   "Staic Block");
	}
	{
		System.out.println("Instance Block");
	}
		
	public abstract void Mul();

}

class A extends Multiply{

	@Override
	public void Mul() {
	System.out.println("Abstract Method");
		
	}
	
}


	
	