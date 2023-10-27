package org.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IterateMap {

	public static void main(String[] args) {
		int[] Key = { 10, 20, 30, 40, 50, 60, 10, 50, 40 };
		String[] Value = { "java", "sq!", "oops", "Sql", "oracle", "DB", "selenium", "psql", "Hadoop" };
		Map<Integer, List<String>> m = new HashMap<>();
		for (int i = 0; i < Key.length; i++) {
			int keys = Key[i];
			String values = Value[i];
			if (!m.containsKey(keys)) {
				m.put(keys,new ArrayList<>());
				
			}
			m.get(keys).add(values);
			
		}
		for (Map.Entry<Integer,List<String>> hm :m.entrySet()) {
			int keys=hm.getKey();
			List<String> values1 = hm.getValue();
			System.out.println("KEYS : "+keys);
			System.out.println("VALUES: "+values1);
		}
		
	}

}
