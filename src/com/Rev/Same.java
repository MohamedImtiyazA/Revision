package com.Rev;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Same {
	
	public static void main(String[] args) {
		Map<String,Integer> a = new LinkedHashMap<String,Integer>();
		a.put("imt@123", 123);
		a.put("ras@234", 234);

		Map<String,Integer> b = new LinkedHashMap<String,Integer>();
		b.put("aat@345", 345);
		b.put("aye@456", 456);

		Map<String,Integer> c = new LinkedHashMap<String,Integer>();
		c.put("moh@567", 567);
		c.put("ees@678", 678);
		
		List<Map<String,Integer>> l = new LinkedList<Map<String,Integer>>();
		l.add(a);
		l.add(b);
		l.add(c);
		
		Map<String, Integer> map = l.get(2);
		Integer integer = c.get("ees@678");
		System.out.println(integer);
		
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
//		
//		List<Integer> li = l.get(1);
//		Integer integer = li.get(2);
//		System.out.println(integer);
	}

}
