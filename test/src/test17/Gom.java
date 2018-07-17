package test17;

public class Gom extends Human {
	Gom(String name, int age, int num){
		super(name, age, num);
		
	}
	public void printHuman() {
		System.out.println("난"+name+"이라고해 ~");
		super.printHuman();
	}
	
	public static void main(String[] args) {
		Gom go = new Gom("민우",17,5);
		go.printHuman();
	}
	
}
