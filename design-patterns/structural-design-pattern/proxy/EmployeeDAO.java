package pac;

public interface EmployeeDAO {
	void create(String client, EmployeeDAO obj) throws Exception;

	void delete(String client, int employeeId) throws Exception;

	Employee get(String client, int employeeId) throws Exception;
}
