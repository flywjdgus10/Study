package Java_11.IntroHashMap;

import java.util.HashMap;


public class IntroHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(new Integer(3), "three");
		hMap.put(1,"one");
		hMap.put(2,"two");
		System.out.println(hMap.get(2));
		System.out.println(hMap.get(1));
		
		hMap.remove(3);
		System.out.println(hMap.get(3));
	}

}
