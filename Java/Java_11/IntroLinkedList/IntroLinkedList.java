package Java_11.IntroLinkedList;

import java.util.LinkedList;

public class IntroLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		list.remove(1);
		

		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
