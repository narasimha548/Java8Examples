package com.app.Streams.model;

import java.util.HashSet;

public class StudentDto {

	private Integer stdId;;
	private String stdName;
	private String marks;

	public StudentDto() {

	}

	public StudentDto(Integer stdId, String stdName, String marks) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.marks = marks;
	}

	public Integer getStdId() {
		return stdId;
	}

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentDto [stdId=" + stdId + ", stdName=" + stdName + ", marks=" + marks + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
	 * return result; }
	 */
/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stdId == null) ? 0 : stdId.hashCode());
		return result;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDto other = (StudentDto) obj;
		if (stdId == null) {
			if (other.stdId != null)
				return false;
		} else if (!stdId.equals(other.stdId))
			return false;
		return true;
	}

	public static void main(String[] args) {

		StudentDto dto = new StudentDto(12, "", "");
		StudentDto dto1 = new StudentDto(12, "", "");
		System.out.println(dto.stdName);

		HashSet<StudentDto> studentsSet = new HashSet<>();
		studentsSet.add(dto);
		studentsSet.add(dto1);

		System.out.println("hash code for dto ::: " + dto.hashCode());
		System.out.println("hash code for dto1 ::: " + dto1.hashCode());

		System.out.println(" equlas testing ::: " + dto.equals(dto1));

		System.out.println("Hash Set size::: " + studentsSet.size());

		System.out.println("Hash set contains ::: " + studentsSet.contains(new StudentDto(12, "", "")));

	}

}
