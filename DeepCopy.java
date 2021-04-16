package been;

public class DeepCopy {

	int x=1000;
	int y=2000;
	int z=4723;
	String a="shallow";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Copying c=new Copying();
c.x=1000;
c.y=2000;
c.z=4723;
c.a="shallow";                                  
//create new object and add one by one.
Copying c1=new Copying();
c.x=c1.x;
c.y=c1.y;
c.z=c1.z;
c.a="DeepCopy";

System.out.println(c);
System.out.println(c1);
	}

	@Override
	public String toString() {
		return "Copying [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + "]";
	}


}
