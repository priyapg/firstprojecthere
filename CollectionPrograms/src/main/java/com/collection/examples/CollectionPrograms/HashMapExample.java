package com.collection.examples.CollectionPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
//hashmap put value in sorting order
//changing hashmap to concurrenthashmap
public class HashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> hmStudent= new ConcurrentHashMap<Integer, String>();
		hmStudent.put(1, "Aarti");
		hmStudent.put(4, "Sonam");
		hmStudent.put(3, "Radha");
		hmStudent.put(2, "Priyam");
		System.out.println(hmStudent);
		//3 ways to iterate through a hashmap
		System.out.println("args length"+args.length);
		for(Map.Entry<Integer, String> e:hmStudent.entrySet()) {
			System.out.println(e.getKey()+"=="+e.getValue());
		}
		
		Iterator<Entry<Integer,String>> itr= hmStudent.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			//hmStudent.put(6, "Manish");
		}
		System.out.println(hmStudent);
	}

}
