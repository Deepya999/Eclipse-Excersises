package Exceptionhandlig;
import java.io.*;
public class Filehandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileWriter fw=new FileWriter("abc.txt");
fw.write("employee name is deepya");
fw.write(Integer.toString(101));
fw.close();


	}

}
