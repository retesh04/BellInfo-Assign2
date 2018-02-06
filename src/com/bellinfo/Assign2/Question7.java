package com.bellinfo.Assign2;

public class Question7 {

	public static void main(String[] args) {
	  Chase c1 = new Chase();
	  System.out.println(c1.a);
	  
	}

}

class Bank {

	int a = 1;
	int b = 2;

	void Type() {
		System.out.println("VISA");
	}

	void Last4Dig() {
		System.out.println(1234);
	}

}

class Chase extends Bank {

	int a = 10;
	int b = 2;
	int c = 3;
	void Type() {
		System.out.println("Chase Visa");
	}
	
	void branch() {
		System.out.println("Sterling");
	}

}