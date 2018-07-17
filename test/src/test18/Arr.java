package test18;

public class Arr {
	
	public static void main(String[] args) {
		int[][] arr = new int[2][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		for(int i=0; i<arr.length;i++) {
			int[] tmpArr = arr[i];
			for(int j=0; j<tmpArr.length;j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				System.out.println(arr[i][j]);
			}
			System.out.println(i+"번째 층의 방갯수 : "+arr[i].length);
			
		}
		
	}

}