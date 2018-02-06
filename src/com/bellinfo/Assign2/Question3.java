package com.bellinfo.Assign2;

public class Question3 {

	public static void main(String[] args) {
      StaticBlock.Addition();
		

	}
}

interface StaticBlock {
	
	static void Addition(){
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println(c+ "Staic Block");
	}
	public void Add();
	
	/*{
		System.out.println("Instance Block");
	}*/
	
}

/*class A implements StaticBlock {

@Override
	public void Add() {
	System.out.println("Method");
		
	}
}*/
