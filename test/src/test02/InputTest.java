package test02;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù���� �Է�:");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.print("�ι�° ���� �Է�:");
		int num2 = Integer.parseInt(scan.nextLine());
		System.out.print("������ �Է�:");
		String op = scan.nextLine();
		System.out.println(num1 + ""+ op + "" + num2);
		if(op.equals("+")) {
			System.out.println(num1+num2);
		}else if(op.equals("_")) {
			System.out.println(num1-num2);
		}else if(op.equals("*")) {
			System.out.println(num1*num2);
			}else if(op.equals("/")) {
				System.out.println(num1/num2);
		}else {
			System.out.println("������ �ȹٷ� �Է��ؾ���!!!");
		}
		
	}

}
