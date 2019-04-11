package com.maps;

import java.util.HashMap;
import java.util.Map;

public class MapDistinctValues {
	
	public static void main(String[] args) {
		Map<Integer,Boolean> m = new HashMap<>();
		m.put(new Integer(1), new Boolean(false));
		m.put(new Integer(2), new Boolean(false));
		m.put(new Integer(3), new Boolean(false));
		
		if (m.values().stream().distinct().limit(2).count() < 2) {
			System.out.println("true");
		}
		
	}

}
