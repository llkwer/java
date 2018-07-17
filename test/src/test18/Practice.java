package test18;

public class Practice {
	public static void main(String[] args) {
			int[] arr = new int[] {7,2,1,4,5,8};
			
			for(int i=0;i<arr.length;i++){
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]<arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
	}
