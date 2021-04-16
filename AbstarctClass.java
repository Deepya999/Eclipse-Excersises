package com;
public class AbstarctClass{
	public static void main(String[]args){
		MaheshPhone mp=new SureshPhone();
		mp.call();
		mp.msg();
		mp.charge();
		mp.move();
	}}
		
		abstract class MaheshPhone{
			public void call(){
				System.out.println("calling...");
			}
			public abstract void msg();
			public abstract void charge();
			public abstract void move();
			
		}
		abstract class RameshPhone extends MaheshPhone{
			public void msg(){
				System.out.println("messaging..");
			}
			
			
}