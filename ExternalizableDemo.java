package been;

import java.io.*;
public class ExternalizableDemo implements Externalizable{
	int i=100;
	  transient int j=200;
	 String k="myntra";
	double l=300.123;
public ExternalizableDemo(){
	System.out.println("no argument constructor");
}
	
public ExternalizableDemo(int i,int j,String k, double l){
	this.i=i;
	this.j=j;
	this.k=k;
	this.l=l;
	
}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		j=in.readInt();
		k=(String)in.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		out.writeInt(j);
		out.writeObject(k);
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExternalizableDemo ed=new ExternalizableDemo(100,200,"myntra",300.123);
		FileOutputStream fos=new FileOutputStream("ABC.xyz");  //SERILALIZATION
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ed);
		
		FileInputStream fis=new FileInputStream("ABC.xyz");
		ObjectInputStream ois=new ObjectInputStream(fis); 
		ExternalizableDemo ed1=(ExternalizableDemo)ois.readObject();
		System.out.println( ed1.j+" "+ ed1.k);
		
		
		
		

	}

	
	

	
}
