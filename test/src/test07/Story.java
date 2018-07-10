package test07;

import java.util.Scanner;

public class Story {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학생들의 점수를 ,로" + "구분하여 입력하여주세요");
		String pointStr = scan.nextLine();
		System.out.println(pointStr);
		String[] pointStrs = pointStr.split(",");
		for(int i=0; i<arrStr.length; i++) {
			String str=(i+1) + "번째 학생 :"+arrStr[i];
			System.out.println();
		}
		
	}
}
