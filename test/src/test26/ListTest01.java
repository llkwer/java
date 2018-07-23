package test26;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	
	public static void main(String[] args) {
		List<Number> al = new ArrayList<Number>();
		al.add(10);
		al.add(10.1);
		
		for(int i=0; i<al.size(); i++) {
			al.set(i, 30+i);
//		for(Number n:al) { // 배열 일 때만 사용 가능 for(매개변수 변수:리스트 변수){
			System.out.println(al.get(i));
		}
//		 Number n = al.get(0);
//		 al.set(0,20);
//		 n = al.get(0)
//		 System.out.println(n);
		
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		Number n = new Integer(3);
//		n = new Double(1.1);
//		n = new Float(2.2);
//		n = new Long(3);
//		System.out.println("al의 방갯수:"+ al.size());
	}

}
