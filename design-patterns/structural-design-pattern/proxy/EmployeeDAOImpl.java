package pac;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void create(String client, EmployeeDAO obj) throws Exception {
		// creates a new row.
		System.out.println("created new row in the Employee table");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		// delete a row.
		System.out.println("deleted row with employeeId: " + employeeId);
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		// fetch a row.
		System.out.println("fetching data from DB");
		return new Employee();
	}
}
