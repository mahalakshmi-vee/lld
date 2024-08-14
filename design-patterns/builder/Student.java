package microsoft_oa;

public class Student {
	private String name;
	private int age;
	private String batch;
	private int gradYear;

	// Builder Design Pattern - Use when the class have lot more different
	// attributes.
	public Student(StudentBuilder studentBuilder) {
		if (studentBuilder.getAge() < 20) {
			throw new IllegalArgumentException("Age should be less than 20");
		}
		if (studentBuilder.getGradYear() > 2024) {
			throw new IllegalArgumentException("GradYear should be greater than 2024");
		}
		name = studentBuilder.getName();
		age = studentBuilder.getAge();
		batch = studentBuilder.getBatch();
		gradYear = studentBuilder.getGradYear();
	}

	public static StudentBuilder getBuilder() {

		return new StudentBuilder();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getBatch() {
		return batch;
	}

	public int getGradYear() {
		return gradYear;
	}

}
