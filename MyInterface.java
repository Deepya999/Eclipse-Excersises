package com;

public interface MyInterface {
public default void sprite(){ //abstract
	System.out.println("sprite is a cooldrink");
}
public void Thumpsup();
	

}
class Deepya{
	public void Thumpsup(){
		System.out.println("It is black");
	}

public static void main(String[]args){
	Deepya d=new Deepya();
	d.Thumpsup();
	((MyInterface) d).sprite();
}}