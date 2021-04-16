package bean;



interface Deepu {
public default void sprite(){ //abstract
	System.out.println("sprite is a cooldrink");
}
public void Thumpsup();
	

}
class Hiii implements Deepu{
	public void Thumpsup(){
		System.out.println("It is black");
	}
	
	public  void sprite(){
		
	}
public static void main(String[]args){
	Deepya d=new Deepya();
	d.Thumpsup();
	d.sprite();
}}