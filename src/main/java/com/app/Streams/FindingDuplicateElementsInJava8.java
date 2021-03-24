package com.app.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class FindingDuplicateElementsInJava8 {

	
	public  static <T> Set<T> findDupliactes(List<T> lstData) {

		Set<T> s = new HashSet<>();

		return lstData.stream().filter(n -> !s.add(n)).collect(Collectors.toSet());
	}

	public static void main(String[] args) {
		
		    List<Integer>  lst=Arrays.asList(1,2,3,4,5,3,9,1,2,5,90);
		    
		    Set<Integer> dupliactes = findDupliactes(lst);

		    System.out.println(dupliactes);
		    
	}

}
