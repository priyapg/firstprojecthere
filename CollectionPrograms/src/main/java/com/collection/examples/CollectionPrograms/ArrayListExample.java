package com.collection.examples.CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> company= new ArrayList<String>();
		company.add("Honeywell");
		company.add("Microsoft");
		company.add("Harman");
		company.add("Apple");
		System.out.println(company);
		Iterator<String> itr= company.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			if(itr.next()=="Apple") {
				itr.remove();
			}
			//company.add("Pepsi");//gives concurrentmodificationexception on arraylist
		}
		System.out.println(company);
		company.add("Dell");
	System.out.println(company.getClass());
	System.out.println(company.subList(1,3));
	company.set(2, "Pwc");
	System.out.println(company);
	ListIterator<String> listItr= company.listIterator();
	while(listItr.hasNext()) {
		//System.out.println(true);
			System.out.println(listItr.next());
			
		}
	while(listItr.hasPrevious()) {
		//System.out.println(true);
			System.out.println(listItr.previous());
			
		}
	}

}
