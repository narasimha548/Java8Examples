package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import com.app.Streams.FindingDuplicateElementsInJava8;
import com.app.Streams.examples.Test1;

public class StreamTest {

	public Test1 obj = null;
	List<String> lst=null;
	
	public FindingDuplicateElementsInJava8 ref=null;
	//private List<String> ;

	@BeforeClass
	public static void excuteInit() {
		System.out.println("executed in   excuteInit() ");
	}

	@Before
	public void init() {
		obj = new Test1();
        ref=new FindingDuplicateElementsInJava8();
        lst=Arrays.asList("Narasimha","prasad","wick","prasad");
		System.out.println(":::::::::  Initalized obj ::::::  ");
	}
	
	@Test
	public void test2(){
		  List<String> actualValues = Arrays.asList("Narasimha","prasad","wick","prasad");
	 //     Set<String> dupliactes = ref.findDupliactes(lst);
		      
		assertThat(actualValues, hasItem("prasad"));
	}

	@Test
	public void testStreamList() {

		List<String> actualValue = Arrays.asList("BMW", "AUDI", "SUZUKI", "ROYAL ENFILED", "JAGUVAR", "MARUTHI", "FORD",
				"TATA", "TOYOTA");
		// List<String> exepectedValue =
		// Arrays.asList("BMW","AUDI","SUZUKI","JAGUVAR","MARUTHI","FORD","TATA","TOYOTA");

		List<String> processListOfCars = obj.processListOfCars(actualValue);

		assertThat(actualValue, is(processListOfCars));

		// assertThat(actualValue, hasItem("ROYAL ENFILED"));

	}

	@Test
	public void testStreamList1() {

		// Test1 obj=new Test1();

		List<String> actualValue = Arrays.asList("BMW", "AUDI", "SUZUKI", "ROYAL ENFILED", "JAGUVAR", "MARUTHI", "FORD",
				"TATA", "TOYOTA");
		// List<String> exepectedValue =
		// Arrays.asList("BMW","AUDI","SUZUKI","JAGUVAR","MARUTHI","FORD","TATA","TOYOTA");

		// assertThat(actualValue, is(exepectedValue));

		assertThat(actualValue, hasItem("AUDI"));

	}

	@Test
	public void sortingListTest() {
		List<String> list = Arrays.asList("BMW", "AUDI", "SUZUKI", "ROYAL ENFILED", "JAGUVAR", "MARUTHI", "FORD",
				"TATA", "TOYOTA");

		// List<String> actualValue =
		// list.stream().sorted().collect(Collectors.toList());

		List<String> actualValue = obj.sort(list);

		List<String> expectedValue = Arrays.asList("AUDI", "BMW", "FORD", "JAGUVAR", "MARUTHI", "ROYAL ENFILED",
				"SUZUKI", "TATA", "TOYOTA");

		assertThat(actualValue, is(expectedValue));

	}

	@After
	public void destory() {
		obj = null;

		System.out.println("Obj destroyed ::::::  ");
	}

	@AfterClass
	public static void excuteDestory() {
		System.out.println("executed in   excuteDestory() ");
	}

}
