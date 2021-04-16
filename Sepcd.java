package com;
interface Interface1 
{ 
    
    default void dance() 
    { 
        System.out.println("This sis i1"); 
    } 
} 
  
interface Interface2 
{ 

    default void dance() 
    { 
        System.out.println("This is i2"); 
    } 
} 
  

class Specd implements Interface1, Interface2 
{ 
    
    public void dance() 
    { 
        
        Interface1.super.dance(); 
  
       
        Interface2.super.dance(); 
    } 
  
    public static void main(String args[]) 
    { 
        Specd d = new Specd(); 
        d.dance(); 
    } 
} 