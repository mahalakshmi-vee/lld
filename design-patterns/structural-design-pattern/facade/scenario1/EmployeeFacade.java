package scenario1;

public class EmployeeFacade {
	// This employee DAO has more methods in it but client want to use only certain
	// methods in
	// that case we can use Facade design pattern.
	private EmployeeDAO employeeDAO;

	public EmployeeFacade() {
		this.employeeDAO = new EmployeeDAO();
	}

	public void insert() {
		employeeDAO.insert();
	}

	public Employee getEmployeeDetails(int empId) {
		return employeeDAO.getEmployeeDetails(empId);
	}
}
