package dep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ls=new HashSet<String>();  
		ls.add("hello");
		ls.add("hiii");
		ls.add("welcome");
		ls.add("aadhab");
		
   Iterator<String> iterator =ls.iterator();
   while (iterator.hasNext()) {
	String l = (String) iterator.next();
	System.out.println(l);
	if("hello".equals(l)){
		iterator.remove();
	}
	System.out.println(ls);
}
		
		
		Map<String, String> map=new HashMap<String, String >();
		
		map.put("ab" ,"cd");
		map.put("ef", "gh");
		map.put("ij", "kl");
		Iterator<String> iterator1= map.keySet().iterator();		
		while (iterator1.hasNext()) {
			String maps = (String) iterator1.next();
			System.out.println(maps);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}


