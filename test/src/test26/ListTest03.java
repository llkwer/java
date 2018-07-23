package test26;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest03 {
	
	public static void main(String[] args) {
		List<Person> pList = new ArrayList<Person>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력해주세요");
			String name = s.nextLine(); 
			System.out.println("나이를 입력해 주세요");
			int age = Integer.parseInt(s.nextLine());
			pList.add(new Person(name,age));
		}
		for(Person p:pList) {
			System.out.println(p);
		}
		
		//Person p = new Person("홍길동",22);
//		for(int i = 1; i<10; i++) {
//			Integer num = (int)(Math.random()*100)+1;
//			pList.add(new Person("홍길동",num));
//		for(int i = 1; i<5; i++) {
//			Integer num = (int);
//			pList.add(new Person("홍길동",num));
//			
		}
//		for(Person p:pList) {
//		System.out.println(p);
//		}
		//반복문으로 나이만 랜덤으로 1~100살 까지 집어 넣어서
		// 총 10명의 사람을 가지고 있는 리스트를 만들어서 출력해주세요.
		// List 는 데이터 타입 하나 밖에 안 된다.
	}

//}

