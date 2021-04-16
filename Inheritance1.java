package com;

public class Inheritance1 {



	void read() {
		System.out.println("this is already read");}
}
class Inhertance2 extends Inheritance1{
	public void read(){
		super.read();
		System.out.println("This is not read");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inhertance2 i= new Inhertance2();


		i.read();
	}

}
