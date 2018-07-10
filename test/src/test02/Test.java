package test02;

public class Test {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		
		if(a!=b) {
			if(a<b) {
				System.out.println("a가 b보다 작네요");
			}
		}
		
		if(a!=b && a<b) {
			System.out.println("a와b는 다르면서 a가 b보다 작내요");
		}
		
		if(a==b || a<b) {
			System.out.println("a와b는 다르거나 a가b보다 작내네요");
		}
	}
}
