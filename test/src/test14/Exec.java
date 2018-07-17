package test14;

public class Exec {
	
	public static void main(String[] args) {
		Animal c = new Dog();
		Dog d = new Dog();
		d.name = "카드";
		d.age  = 10;
		d.type = "잉글리쉬코카";
		c.printInfo();
		
	}

}
