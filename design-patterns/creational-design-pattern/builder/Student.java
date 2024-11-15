package pac;

import java.util.List;

public class Student {
	int rollNumber;
	int age;
	String name;
	String fatherName;
	String motherName;
	List<String> subjects;

	public Student(StudentBuilder studentBuilder) {
		this.rollNumber = studentBuilder.rollNumber;
		this.age = studentBuilder.age;
		this.name = studentBuilder.name;
		this.fatherName = studentBuilder.fatherName;
		this.motherName = studentBuilder.motherName;
		this.subjects = studentBuilder.subjects;
	}

	@Override
	public String toString() {
		return "" + " roll number: " + this.rollNumber + " age: " + this.age + " name: " + this.name + " fatherName: "
				+ this.fatherName + " motherName: " + this.motherName;
	}
}
