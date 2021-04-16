package dep;

public class ConstructorDemo {
int x;
ConstructorDemo(int y) {
	x=y;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo(7);
		System.out.println(cd);
		
		
	}

	@Override
	public String toString() {
		return "ConstructorDemo [x=" + x + "]";
	}

}
