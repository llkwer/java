package test07;

import java.util.Scanner;

public class SoftTest {

	public static void main(String[] args) {
		int[] arrNum = new int[5];
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 70;
		arrNum[3] = 50;
		arrNum[4] = 40;
		for (int i = 0; i <= 4; i++) {
			if (arrNum[i] % 20 == 0 && arrNum[i] != 0) {
				System.out.println(arrNum[i]);
			}
		}
		String[] arrStr = new String[5];
		arrStr[0] = "a";
		arrStr[1] = "b";
		arrStr[2] = "c";
		arrStr[3] = "d";
		arrStr[4] = "e";
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
		
		String str = "a,b,c,d,e";
		arrStr = str.split(",");
		for (int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}
	}
	Scanner scan = new Scanner(System.in);
	System.out.println("학생들의 점수를, 로 구분하여 입력!");
	String pointStr = scan.nextLine();
	scan.close();
	String[] arrStr = pointStr.split(",");
	System.out.println(i+1)+"번째 점수:" + arrStr[i]);
		
	}

}