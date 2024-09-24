package pac;

public class Client {
	public static void main(String[] args) {
		try {
			EmployeeDAO employeeDAO = new EmployeeDAOProxy();
			employeeDAO.create("ADMIN", employeeDAO);
			System.out.println("Operation successful");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
