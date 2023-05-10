package student.Domain_Layer;

import java.util.List;

public interface EmpRepository {
    void add(Employee employee);
    void delete(Employee employee);
    Employee search(Employee employee);

    List<Employee> getEmployees();
}
