package student.Domain_Layer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository implements EmpRepository {

    List<Employee> employees;

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Employee search(Employee employee) {
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }
}
