package com.app.java7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToList {
	
	public static void main(String[] args) {
		Map<String, String> m=new HashMap<>();
		m.put(null, "null");
		m.put("Jammu & Kashmir", "Ladkh");
		m.put(null, "kurnool");
		
		System.out.println(m);
		
		Set<Entry<String, String>> entrySet = m.entrySet();
		
		List<String> lst=new ArrayList<String>(m.keySet());
		
		System.out.println(lst);
		
		
	}

}
