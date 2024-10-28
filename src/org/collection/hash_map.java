package org.collection;

import java.util.Map;
import java.util.TreeMap;

public class hash_map {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//value allow duplicate no null 
		//ascending order on key
		Map<Integer,String> h =new TreeMap <Integer,String>();
		h.put(20, "table");
		h.put(10, "chair");
		h.put(20, "tv");
		h.put(78, "tv");
		System.out.println(h);
		
	}

}
