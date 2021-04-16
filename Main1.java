package com;

 abstract  class Human {
	
	public void dance(){
		System.out.println("all humans can dance");
	}
	public abstract void Sing();
	public abstract void read();
 }
	
	abstract class Ladies extends Human{
		Ladies(){
		super();
		}
		public void Sing(){
			System.out.println("Ladies can sing");
		}
			public abstract void read();
		
	}
	public class Main1{
		public static void main (String[]args){
			Human obj=new Gents();
			obj.dance();
			obj.Sing();
			obj.read();
		}
	}
	

