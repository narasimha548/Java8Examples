package com.app.Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.Streams.model.StudentDto;

public class StreamTest {

	@SuppressWarnings("unused")
	private static List<String> sortStudentMarks(List<StudentDto> lst) {
		// System.out.println("lst data found..." + lst);
		List<String> collect = null;
		if (lst.isEmpty()) {
			System.out.println("not data found...");
		} else {

			collect = lst.stream().map(StudentDto::getStdName).distinct().collect(Collectors.toList());

			// collect = lst.stream().map(e ->
			// e.getMarks()).distinct().collect(Collectors.toList());
			// System.out.println("not data found..."+collect);
		}

		return collect;
	}

	/**
	 * 
	 * @param lst
	 * @return
	 */
	public static List<String> fetchStudentsBasedOnmarks(List<StudentDto> lst) {

		return lst.stream().filter(s -> s.getMarks().equals("98")).map(StudentDto::getStdName)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		StudentDto dto = new StudentDto();
		dto.setMarks("98");
		dto.setStdId(1);
		dto.setStdName("narasimha");

		StudentDto dto1 = new StudentDto();
		dto1.setMarks("7");
		dto1.setStdId(2);
		dto1.setStdName("narasimha");

		StudentDto dto2 = new StudentDto();
		dto2.setMarks("98");
		dto2.setStdId(3);
		dto2.setStdName("t");

		List<StudentDto> lst = new ArrayList<StudentDto>();
		lst.add(dto);
		lst.add(dto1);
		lst.add(dto2);

		List<String> studentMarks = StreamTest.sortStudentMarks(lst);

		System.out.println(studentMarks);

		List<String> stdNames = StreamTest.fetchStudentsBasedOnmarks(lst);
		System.out.println(stdNames);

		boolean match = lst.stream().anyMatch(s -> s.getStdId() == 1);

		if (match) {
			System.out.println("jjkjhnhjjh ");
		}

		String s = "narasimha \"prasad\" ";

		System.out.println("output :  " + s);

	}

}
