package test09;

public class FunctionTest {
	
	void print(String str) {
		System.out.println(str);
	}
	static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	static int getNum() {
		return 0;
	}
	public static void main(String[] args) {
		sum(2,3);
		String str = getNum() + "";
		System.out.println(str);
	}

}
