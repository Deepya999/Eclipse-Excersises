package bean;
interface TestInterface 
{ 
   
    public void square (int a); 
  
   
    static void show() 
    { 
        System.out.println("shoeed"); 
    } 
} 
  
class TestClass implements TestInterface 
{ 
    
    public void square (int a) 
    { 
        System.out.println(a+a); 
    } 
  
    public static void main(String args[]) 
    { 
        TestClass d = new TestClass(); 
        d.square(100); 
  
       
        TestInterface.show(); 
    } 
} 