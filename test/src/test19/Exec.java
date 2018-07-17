package test19;

public class Exec {
	
	public static void eat(Action p) {
		p.eat();
	}
	public static void main(String[] args) {
		Action act = new Animal();
		act = new Person();
		eat(act);
		eat(new Animal());
		eat(new Person());
//		act.eat();
//		act.move();
//		Animal ani = (Animal) act;
//		
//		act = new Person();
//		act.eat();
//		Person per = (Person)act;
//		per.work();
	}

}
