package microsoft_oa;

public class Client {
	public static void main(String[] args) {
		// Builder Design Pattern.
		Student student = Student.getBuilder().setAge(20).setBatch("Apr2023").setGradYear(2025).setName("John").build();
		System.out.println(student);
	}
}
