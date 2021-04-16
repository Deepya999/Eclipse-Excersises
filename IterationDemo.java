package dep;
import java.util.*;
public class IterationDemo{
	public static void main(String[]args){
		LinkedList<String> li=new LinkedList<>();
		li.add("abc");
		li.add("xyz");
		li.add("opq");
		
		Iterator<String> itr=li.iterator();
		while(itr.hasNext()){
			String s=(String)itr.next();
			System.out.println(s);
		}
	}
	}
