package bean;



public interface ThisInterface {
public default void sprite(){ //abstract
	System.out.println("sprite is a cooldrink");
}
public void Thumpsup();
	

}
class Deepya{
	public void Thumpsup(){
		System.out.println("It is black");
	}
	public void sprite() {
		// TODO Auto-generated method stub
	}
public static void main(String[]args){
	Deepya d=new Deepya();
	d.Thumpsup();
	d.sprite();
}


}