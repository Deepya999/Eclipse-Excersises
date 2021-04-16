package been;
import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Computer implements Serializable
{
	Computer c=new Computer();
}

class Printer implements Serializable
{
	Printer p=new Printer();
}
class Keyboard implements Serializable
{
	Keyboard k=new Keyboard();
}
public class DontKnowtheorder  {


	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		DontKnowtheorder d1=new DontKnowtheorder();
		FileOutputStream fos=new FileOutputStream("ABC.xyz");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(oos);

	FileInputStream fis=new FileInputStream("ABC.xyz");
	ObjectInputStream ois=new ObjectInputStream(fis);  
	Object o= ois.readObject();
	
	 if(o instanceof Computer){
		 Computer c1=(Computer)o{
		 
		
	
	 
	 elseif( o instanceof Printer){
		 Printer p1=(Printer)o;
		 
	 }
	 elseif(o instanceof Keyboard){
		 Keyboard k1=(Keyboard)o
	 }
	
	}


}
