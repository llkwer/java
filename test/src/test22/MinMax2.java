package test22;

public class MinMax2 {
	public static void main(String[] args) {
		int a=2;
		int b=10;
		int c=4;
		int d=20;
		
		int min=a;
		int max=a;
		
		int[] bea = {a,b,c,d};
		
		for(int i=0; i<bea.length; i++) {
		if(min>bea[i]) {
			min=bea[i];
		}
		if(max<bea[i]) {
			max=bea[i];
		}
		}	
		for(int i=min; i<=max; i++) {
		}
		System.out.println(min);
		System.out.println(max);
	}

}
