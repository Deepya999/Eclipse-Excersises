package com;

public class AllOverloading {
 /*public void m1(int i){
	System.out.println("int param method");
	
}
public void m1(float f){
	System.out.println("float param method");
}
	public static void main(String[] args) {    //int-long-float-double
		// TODO Auto-generated method stub         |
		AllOverloading obj=new AllOverloading();   //char
		obj.m1('a');
		obj.m1(10l);
// even char is not there in paramerter methods it executes because
		//of automatic promotion int promotes to char.
}
*/
	
	
	
/*	public void m1(Object o){
		System.out.println("object priority");
	}
	public void m1(String s){
		System.out.println("string priority");
	}
	public static void main(String[] args) {    
		// TODO Auto-generated method stub         |
		AllOverloading obj=new AllOverloading();
		obj.m1(new Object());
		obj.m1("deepya");
		obj.m1(null);//---------it takes string priority because string is the child class
		                       //of Object.Because it always matches to child first then parent.
}*/

	
	
	
	/*public void m1(int i , float f){
		System.out.println("int-float");
		
	}
public void m1(float i , int f){
	System.out.println("float-int");
}
public static void main(String[] args) {    
	// TODO Auto-generated method stub         |
	AllOverloading obj=new AllOverloading();
	obj.m1(1, 10.3f);
	obj.m1(10.3f ,1);
	
	obj.m1(10, 10);// here no precedence is seen from left to right.
    obj.m1(10.3f,10.3f);


}*/

	
/*public void m1(int a){
		System.out.println("a is done");// we can change our return type 
	}
	public int m1(int a ,float f){
		return a;
		
	}
	public static void main(String[] args) {    
		// TODO Auto-generated method stub         |
		AllOverloading obj=new AllOverloading();
	obj.m1(1);
	obj.m1(1,10.45f);
	}	*/
	
}