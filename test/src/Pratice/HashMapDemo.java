package Pratice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,Integer> fruitMap = new HashMap<String,Integer>();
		fruitMap.put("사과", 1000);
		fruitMap.put("배", 2000);
		fruitMap.put("자두", 3000);
		fruitMap.put("수박", 4000);
		System.out.println(fruitMap.get("자두"));
		System.out.println(fruitMap.values());
		Set<Entry<String,Integer>>Set=fruitMap.entrySet();
		Iterator<Entry<String,Integer>>itr=Set.iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer>e=(Map.Entry<String,Integer>)itr.next();
			System.out.println("이름 : "+e.getKey()+", 가격:"+e.getValue()+"원");
			
		}
	}

}
