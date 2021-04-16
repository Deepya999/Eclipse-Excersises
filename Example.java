package been;
import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
class Serialization implements Serializable{
	int empid;
	String empname;
	int phonenumber;
	
}
class Example{
	public static void main(String[]args) throws IOException{
		Serialization e=new Serialization();
		e.empid=101;
		e.empname="Raj";
		e.phonenumber=987898789;
		FileOutputStream fos=new FileOutputStream("Emp.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("The details are added in file...");
	}
}