package dep;



import java.util.HashMap;
import java.util.Map;

 public class Tresa {
public static void main(String[] args) {
Map<Integer ,String> bookMap=new HashMap<>();
bookMap.put(1, "edureka");
bookMap.put(2, "force");
bookMap.put(3, "enter");
keysetIteration(bookMap);
}

private static void keysetIteration(Map<Integer, String> bookMap) {
for (Integer bookId : bookMap.keySet()) {
System.out.println("Key Value="+bookId);
System.out.println("Value="+bookMap.get(bookId));
}
}
}