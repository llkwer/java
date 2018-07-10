package test01;

public class JavaTest {

	public static void main(String[] args) {
		int a = 10;
		long b = 10;
		
		double d = 1.1;
		
		char c = 'a';
		
		boolean b1 = true;
		
		String s = "abc";
		int num = 3;
	}
}

static int a = 3;
public static void main(String[] args) {
	int[] arr = new int[3];
	arr[0] = 2;
	arr[1] = 2;
	arr[2] = 2;
	int[] tmparr = arr;
	
	arr = new int[5];
	arr[0] = tmpArr[0];
	arr[1] = tmpArr[1];
	arr[2] = tmpArr[2];
	for(int i=0;i<arr.length;i++) {
		System.out.println("arr[" + i + "]="+arr[i]);
