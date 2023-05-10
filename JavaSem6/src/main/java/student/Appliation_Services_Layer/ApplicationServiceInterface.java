package student.Appliation_Services_Layer;

import student.Domain_Layer.Department;
import student.Domain_Layer.Employee;

public interface ApplicationServiceInterface {
    void addDepartment(Department department);
    void deleteDepartment(String departName);
    Department searchDepartment(String departName);

    void addEmployee(Employee employee);
    void deleteEmployee(String FIO);
    Employee searchEmployee(String FIO);
}
