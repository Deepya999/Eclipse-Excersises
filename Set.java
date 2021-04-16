package dep;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> fruits =new HashSet<String>();
fruits.add("pine");
fruits.add("apple");
fruits.add("mango");
 Iterator<String> itr=fruits.iterator();
 while(itr.hasNext()){
	 String s=(String)itr.next();
	 System.out.println(s);
 }
	}

}
