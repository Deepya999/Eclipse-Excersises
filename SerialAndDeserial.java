package been;

import java.io.Serializable;

import java.io.*;
class Deepya implements Serializable{
  static String i="deepu";
  transient int j=1000;
@Override
public String toString() {
	return "Deepya [i=" + i + ", j=" + j + "]";
}
  
}
 class SerialAndDeserial 
 {

	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		Deepya d=new Deepya();
		FileOutputStream fos=new FileOutputStream("ABC.xyz");  //SERILALIZATION
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("ABC.xyz");
		ObjectInputStream ois=new ObjectInputStream(fis);       //DESERIALIZATION
		Deepya d1=(Deepya)ois.readObject();
		System.out.println(d1);
		

	}

}
