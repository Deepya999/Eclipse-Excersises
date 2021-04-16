package com;

import java.util.Scanner;
import java.util.*;
public class FriutShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hi Welcome to online fruit sale!!");
		Scanner sc=new Scanner(System.in);
		String x= sc.nextLine();

		System.out.println("Which would you like to choose?");
		System.out.println("Select 1 for simple fruits");
		System.out.println("Select 2 for Dry fruits");
		System.out.println("Select 3 for Berry fruits");
		System.out.println("Select 4 for Tropical fruits");
	
		Scanner sc1=new Scanner(System.in);
		 int UsrIn;


         UsrIn = sc1
        		.nextInt();

         int month = UsrIn;

         String Fruits;
         switch (month) {
             case 1:  Fruits = "";
             System.out.println("apples----1kg");
 			System.out.println("mangoes-----1kg");
 			System.out.println("pineapple---1kg");
 			System.out.println("papaya------1kg");
 			String a= sc.nextLine();
			System.out.println("selected");
                      break;
             case 2:  Fruits = "";
             System.out.println("bdam---1kg");
 			System.out.println("pista---1kg");
 			System.out.println("pichi vi---1kg");
 			System.out.println("kullipoyinavi---1kg");
 			String b=sc.nextLine();
 			System.out.println(b +"is selected");
                      break;
             case 3:  Fruits = "";
             System.out.println("cabbage--1kg");
 			System.out.println("cauliflowe---1kg");
 			System.out.println("blue berry--1kg");
 			System.out.println("strawberry---1kg");
 			String c=sc.nextLine();
 			System.out.println(c+" is selected");
                      break;
             case 4:  Fruits = "";
             System.out.println("Pineapple--1kg");
 			System.out.println("neem");
 			System.out.println("cashew----1kg");
 			System.out.println("oranges---1kg");
 		String d=sc.nextLine();
 		System.out.println(d +"is selected");
                      break;
             
             default: Fruits = "Invalid selection";
                      break;
         }
         System.out.println();
     }
			
			
			

	}

	

	

