package test18;

import java.util.Scanner;

public class Exec {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] ps = new Person[5];
		for(int i = 0; i<ps.length; i++) {
		ps[i] = new Person();
		ps[i].name = (i+1)+"번째 사람";
		System.out.println(i+1+"번째 사람의 점수를 입력해주세요");
		ps[i].point = Integer.parseInt(sc.nextLine());
			
		}
	for(int i=0;i<ps.length;i++) {
	System.out.println(ps[i].name +"님의 점수는"+ps[i].point+"입니다.");
		System.out.println(ps[i].name +"님의 등수는"+ps[i].rank+"등 입니다.");
		
	}

	}
}
