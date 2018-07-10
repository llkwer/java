package test11;

public class Exam01 {
	
	public static void main(String[] args) {
		for(int i=0; i<=10;) {
			System.out.println(i);
			if(i%2==0) {
				continue;
			}
			System.out.println(i++);
		}
	}

}
