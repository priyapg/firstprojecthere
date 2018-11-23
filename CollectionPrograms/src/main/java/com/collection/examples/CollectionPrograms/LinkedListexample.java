package com.collection.examples.CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListexample {
	public static void main(String[] args) {
		LinkedList<String> company=new LinkedList<String>();
		company.add("Honeywell");
		company.add("Harman");
		company.add("Harman");
		company.add("Apple");
		System.out.println(company);
		company.addFirst("FirstComapny");
		company.offerLast("Last Company");
		company.poll();
		Iterator<String> itr= company.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().hashCode());
		}
		System.out.println((company.get(1).equals(company.get(2))));
		System.out.println(company);
	}
}
