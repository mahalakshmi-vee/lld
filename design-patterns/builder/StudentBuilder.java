package microsoft_oa;

public class StudentBuilder {
	private String name;
	private int age;
	private String batch;
	private int gradYear;

	public String getName() {
		return name;
	}

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public int getAge() {
		return age;
	}

	public StudentBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public String getBatch() {
		return batch;
	}

	public StudentBuilder setBatch(String batch) {
		this.batch = batch;
		return this;
	}

	public int getGradYear() {
		return gradYear;
	}

	public StudentBuilder setGradYear(int gradYear) {
		this.gradYear = gradYear;
		return this;
	}

	public Student build() {

		return new Student(this);
	}
}
