package Pratice;

import java.util.ArrayList;

public class ListTest3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i<6; i++) {
			int rNum = (int)(Math.random()*45)+1;
			al.add(rNum);
		}
		for(int num : al ) {
			System.out.println(num);
		}
	}

}
