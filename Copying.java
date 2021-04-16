package been;

public class Copying {
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
c.a="shallow";                                   //IT IS BECAUSE 2 OBJECTS C,C1 Pointing to same reference.

//SHALLOWING
Copying c1=c;
c1.y=3000;

System.out.println(c);
System.out.println(c1);
	}

	@Override
	public String toString() {
		return "Copying [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + "]";
	}

}
