package com;

public class EqualsMethods {
	public static void main(String[] args) {
        //Interned way or String Literals
        //stored in string pool
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("str1 = Hello"); //--1
        System.out.println("str2 = Hello"); 
        
        
        
        
        //we are comparing the references str1,str2
        //comparing hashCode in str1 str2 which will be same for String Hello
          if(str1==str2){
              System.out.println("str1==str2");  
          }
          else{
              System.out.println("str1!=str2");
          }
          //These are for whether hashcode is same or not
          
          System.out.println("hashcode of str1 is :"+ str1.hashCode());
          System.out.println("hashcode is str2 is  :"+ str1.hashCode());
          
          
          
          
          
          
          
          
          
          
          
          
          //String object i.e we used new operator
          //str3,str4 are reference variables pointing the two different objects
          String str3 =  new String("Hello");
          String str4 =  new String("Hello");
          System.out.println("str4 = Hello");
          if(str3==str4){
              //we are not comparing the content i.e. hello
              //we are just comparing the hashCode in str3,str4 which will be different for string object containing hello
              
            
              System.out.println("str3==str4");
              }
          else{
              System.out.println("str3!=str4");
          }
          
          
          
          
          if(str3.equals(str4)){
              System.out.println("str3 is equal to str4");
          }
          else{
              
              System.out.println("str3 is not equal to str4");
          }
          
          
          
          
          
          
          
          
          
          if(str3.compareTo(str4)==0){
              System.out.println("str3 compared to str4");
          }
          else{
              System.out.println("str3 not compared to str4");
          }
          
    }

 

}
