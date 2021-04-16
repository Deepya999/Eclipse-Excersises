package com;

public class Calculator {
	int z;
	public  void add( int x, int y){
		System.out.println("add of x ,y:"+ z);
		z=x+y;
	}
	public  void sub( int x, int y){
		System.out.println("sub of x ,y:"+ z);
		z=x-y;
		
	}
	public  void mult( int x, int y){
		System.out.println("mult of x ,y:"+ z);
		z=x*y;
	}
	
	public  void div( int x, int y){
		System.out.println("divof x ,y:"+ z);
		z=x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
int a=10,b=20;
Calculator c=new Calculator();

c.add(a, b);

	}

}
