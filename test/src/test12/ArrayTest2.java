package test12;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 1부터 5까지 중 1개를 입혁해주세요");
		String numStr = scan.nextLine();
		int num = Integer.parseInt(numStr);
		if(num==1) {
			System.out.println("당신은 나서는걸 좋아하는 타입이군요");
		}else if(num==2) {
			System.out.println("당신은 뒤에서 조종하는걸 좋아하시는군요");
		}else if(num==3) {
			System.out.println("당신은 센터에 욕심이 있군요");
		}else if(num==4) {
			System.out.println("");
		}
		System.out.println("니가 입력한 숫자 : "+numStr);
}
}