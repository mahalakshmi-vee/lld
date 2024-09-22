package pac;

public class Client {
	public static void main(String[] args) {
		StudentBuilder engineeringStudentBuilder = new EngineeringStudentBuilder();
		Director director = new Director(engineeringStudentBuilder);
		Student engineeringStudent = director.createStudent();
		System.out.println(engineeringStudent.name);
		System.out.println(engineeringStudent.rollNumber);

		StudentBuilder mbaStudentBuilder = new MBAStudentBuilder();
		director.setStudentBuilder(mbaStudentBuilder);
		Student mbaStudent = director.createStudent();
		System.out.println(mbaStudent.name);
		System.out.println(mbaStudent.rollNumber);
	}
}
