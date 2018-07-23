package test26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils; // jar (메이븐)

public class ListTest02 {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		for(int i=0; i<10; i++) {
			Integer num = (int)(Math.random()*10)+1;
			String str = StringUtils.leftPad(num.toString(), 3,'0'); // StringUtils jar 가 없으면 못 찾는다.
			strList.add(str);
		}
		
		Collections.sort(strList); //오름 차순
		//Collections.reverse(strList); // 내림 차순
		
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
	

}
