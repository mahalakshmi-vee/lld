package pac;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder {
	@Override
	public StudentBuilder setSubjects() {
		List<String> subjects = new ArrayList<String>();
		subjects.add("DSA");
		subjects.add("OS");
		subjects.add("Computer Architecture");
		this.subjects = subjects;
		return this;
	}
}
