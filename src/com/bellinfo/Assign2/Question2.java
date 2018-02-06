package com.bellinfo.Assign2;

public class Question2 {

	public static void main(String[] args) {
		

	}

}
interface PhoneA{
	
	public int type();
}

interface PhoneB{
	
	public int type();
	
}

class U implements PhoneA, PhoneB{

	@Override
	public int type() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}
}