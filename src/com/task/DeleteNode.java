package com.task;

import java.util.Iterator;
import java.util.LinkedList;

public class DeleteNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Siri");
		list.add("Bunny");
		list.add("Jack");
		list.add("Junnu");
		
		String deletenode = "Jack";
		Iterator<String> itr=  list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals(deletenode)) {
				itr.remove();
			}
		}
		System.out.println(list);
	}

}
