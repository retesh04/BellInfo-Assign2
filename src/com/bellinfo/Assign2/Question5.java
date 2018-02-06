package com.bellinfo.Assign2;

public class Question5 {

	public static void main(String[] args) {
		Division Div1 = new Division();
		Div1.Div();
	}

}

class Division {

	static void Div() {
		int a = 100;
		int b = 10;
		int c = a / b;
		System.out.println(+c + "Staic Block");
	}

	{
		System.out.println("Instance Block");
	}

	Division() {
		System.out.println("MyDefaultConstructor");
	}
}