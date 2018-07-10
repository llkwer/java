package test08;

public class LottoTest {
	
	public static void main(String[] args) {
		int[] a = new int[6];
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*45)+1;
			System.out.println(a[i]);
		}
		
		
	}

}
