package com;

public class Inheritance {
	int a1;
	int b1;
	public void Dance(){
		System.out.println("dancing");
		
	}
	public void Sing(){
		System.out.println("Singing");
		
		
	}
	
	public int calculate(int a1 , int b1){
		
		return a1+b1;
		
	}
	
	 static class Activities extends Inheritance{
		public void Art(String painting){
			System.out.println("Boat painting");
		}
		public void Art(String painting,String drawing){
			System.out.println("Boat painting and drawing");
		}
		public void Art(String painting,String drawing,int noofpaintings){
			System.out.println("olny one boat painting");
		}
		public void Art(String painting,String drawing,int noofpaintings,float cost){
			System.out.println("cost of painting is 8999 olny/--- ");
		}
		public void Dance(){
			super.Dance();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activities i = new Activities();
		i.Art(null);
		i.Art(null, null);
		i.Art(null, null, 0);
		i.Art(null, null, 0, 0);
		
		
		

	}

}
