package com.app.java7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class ReadingCsvFile {

	private static List<String> headerList = null;

	static {
		headerList = new ArrayList<String>();
		headerList.add("BATCH_ID");
		headerList.add("BULK_REG_REF_ID");
		headerList.add("CARD_NUMBER");
		headerList.add("REPLACEMENT_TYPE");
		headerList.add("MOBILE");
		headerList.add("BRANCH");

	}

	public static void main(String[] args) throws Exception {
		ProcessCsvFile csv = new ProcessCsvFile();
		// String fileName = "F:\\Narasimha\\ALKURAIMI\\Sample of Files from
		// T24\\Proprietory Card Extract_20201228_0001_YE0012003 (1).csv";

		// int of = fileName.lastIndexOf(".");

		// System.out.println(fileName.substring(of));

		// csv.processCSVFileFormat(fileName);
		
		
		String s="sam2345";
		
		    s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			        char charAt = s.charAt(i);      
			        
			        if(Character.isDigit(charAt)){
			        	  System.out.println(charAt);
			        }
			
		}
		
		
		
		
		List<String> lst=new ArrayList<>();
		lst.add("prasad");
		lst.add("simha");
		lst.add("narasimha");
		lst.add("prasad");
		lst.add("simha");
		
		Set<String> duplicates = findDuplicates(lst);
		System.out.println("duplicates ::: "+duplicates);
		

		String fileName = "F:/Narasimha/ALKURAIMI/Sample of Files from T24/Proprietory Card Extract_20201228_0001_YE0012003 (1).csv";
		String line;
		int lineNo = 0;

		// ListIterator<String> listIterator = headerList.listIterator();

		/*
		 * while (listIterator.hasNext()) { String string = listIterator.next();
		 * System.out.println("string values:: "+string);
		 * 
		 * }
		 */

		BufferedReader br = new BufferedReader(new FileReader(fileName));

		List<ProprietaryDTO> listDto=new ArrayList<ProprietaryDTO>();
		
		line = br.readLine();
		List<String> list = doProcess(line);
	

		boolean b = validateHeaderFileds(headerList, list);

		System.out.println(" boolean " + b);

		while ((line = br.readLine()) != null) {
			ProprietaryDTO prop=new ProprietaryDTO();
			String data[]=line.split(",");
		//	System.out.println(" list values :::: "+data[0]);
			prop.setBatchid(data[0]);
			prop.setBulkRefId(data[1]);
			prop.setCustomerId(data[2]);
			listDto.add(prop);
			System.out.println(" line no :: " + listDto.size());

		}

	}

	/**
	 * Returns true if list contains null or empty values
	 * 
	 * 
	 * @param element
	 *            whose presence in this list is to be validate
	 * @return boolean value
	 */
	private static boolean checkListValidations(List<String> dataList) {

		if (dataList.contains(null) || dataList.contains(""))
			return true;

		return false;
	}

	private static List<String> doProcess(String line) {
		String data[] = line.split(",");
		List<String> lst = new ArrayList<>();
		for (String d : data) {
			lst.add(d);
		}
		return lst;

	}

	/**
	 * missing header filed 
	 * 
	 * @param headerList
	 * @param filedHeader
	 * @return
	 */
	private static boolean validateHeaderFileds(List<String> headerList, List<String> filedHeader) {
		boolean check = false;

		for (String data : headerList) {

			for (String data1 : filedHeader) {

				if (data1.equals(data)) {
					check = true;
				} else {
					return check = false;
				}
			}
		}

		return check;
	}
	
	private static  <T> Set<T> findDuplicates(Collection<T> collection) {

	    Set<T> duplicates = new LinkedHashSet<>();
	    Set<T> uniques = new HashSet<>();

	    for(T t : collection) {
	        if(!uniques.add(t)) {
	            duplicates.add(t);
	        }
	    }

	    return duplicates;
	}

}
