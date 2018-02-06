package com.bellinfo.Assign2;

public class Question6 {

	public static void main(String[] args) {
		D dObj = new D();
		dObj.day1();
		dObj.Time1();
		dObj.day();
		dObj.Time();

	}

}
interface A1{
	void Time();
	void day1();
}
interface B{
	void Time();
	void day1();
}

abstract class C implements A1,B{
	

	public void Time(){
		System.out.println("24hours");
	}
	
	public void day1() {
		System.out.println("Saturday");
	}
	public void Time1(){
		System.out.println("12Hrs");
	}
	
	public void day() {
		System.out.println("Saturday");
	}
}

class D extends C {
	
}