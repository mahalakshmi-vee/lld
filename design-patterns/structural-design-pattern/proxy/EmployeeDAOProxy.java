package pac;

public class EmployeeDAOProxy implements EmployeeDAO {
	private EmployeeDAO employeeDAO;

	public EmployeeDAOProxy() {
		employeeDAO = new EmployeeDAOImpl();
	}

	@Override
	public void create(String client, EmployeeDAO obj) throws Exception {
		if (client.equals("ADMIN")) {

			employeeDAO.create(client, obj);
			return;
		}

		throw new Exception("Access Denied");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN")) {

			employeeDAO.delete(client, employeeId);
			return;
		}

		throw new Exception("Access Denied");
	}

	@Override
	public Employee get(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN") || client.equals("USER")) {

			return employeeDAO.get(client, employeeId);
		}

		throw new Exception("Access Denied");
	}
}
