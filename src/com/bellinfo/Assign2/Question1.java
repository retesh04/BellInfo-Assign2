package com.bellinfo.Assign2;

public class Question1 {

	public static void main(String[] args) {
	Phone Ph = new CellPhone();
	Phone1 Ph1 = new CellPhone();
	Ph.Type();
	Ph1.Type();
	Ph1.OS();
	 }

}

interface Phone{
	 
	void Type();
	void OS();
	void Space();
	void Company();
	void Price();
}

interface Phone1{
	void Type();
	void OS();
	void Space();
	void Company();
	void Price();
}

class CellPhone implements Phone, Phone1 {
	public void Type() {
		System.out.println("iPHONE");
	}
	public void OS() {
		System.out.println("IOS");
	}
	@Override
	public void Space() {
		// TODO Auto-gen=erated method stub
		
	}
	@Override
	public void Company() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Price() {
		// TODO Auto-generated method stub
		
	}
}
