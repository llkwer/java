package test21;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",3);
		ArrayList<Student> sList = new ArrayList<Student>();
		for(int i=1; i<=5; i++) {
			String name = "테스트" +i;
			int grade = (int)(Math.random()*10)+1;
			sList.add(new Student(name,grade));
		}
		for(int i = 0; i<sList.size(); i++) {
			for(int j=i+1; j<sList.size(); j++) {
				if(sList.get(i).grade < sList.get(j).grade) {
				Student t = sList.get(i);
				sList.set(i,sList.get(j));
				sList.set(j, t);
				}
			}
		}
		for(Student st:sList) {
			System.out.println(st.name+","+st.grade);
		}
	}
}


//public class ListTest3 {
//	public static void main(String[] args) {
//		Student s = new Student("홍길동",3);
//		ArrayList<Student> sList = new ArrayList<Student>();
//		for(int i=1; i<=5; i++) {
//			String name = "테스트" +i;
//			int grade = (int)(Math.random()*3)+1;
//			sList.add(new Student(name,grade));
//		}
//		for(Student st:sList) {
//			System.out.println(st.name+","+st.grade);
//		}
//	}
//}
