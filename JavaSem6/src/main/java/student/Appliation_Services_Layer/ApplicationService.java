package student.Appliation_Services_Layer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.Domain_Layer.*;

import java.util.List;

@Service
public class ApplicationService implements ApplicationServiceInterface{

    @Autowired
    EmployeeRepository employees;
    @Autowired
    DepartmentRepository departments;

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void deleteDepartment(String departName) {
        List<Department> list = departments.getDepartments();
        for(Department department : list){
            if(department.getName().equals(departName)){
                departments.delete(department);
            }
        }
    }

    @Override
    public Department searchDepartment(String departName) {
        List<Department> list = departments.getDepartments();
        Department nulldepart = new Department();
        for(Department department : list){
            if(department.getName().equals(departName)){
                nulldepart = departments.search(department);
            }
        }
        return nulldepart;
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(String FIO) {
        List<Employee> list = employees.getEmployees();
        for(Employee employee : list){
            if(employee.getFIO().equals(FIO)){
                employees.delete(employee);
            }
        }
    }

    @Override
    public Employee searchEmployee(String FIO) {
        List<Employee> list = employees.getEmployees();
        Employee nulemploy = new Employee();
        for(Employee employee : list){
            if(employee.getFIO().equals(FIO)){
                nulemploy = employees.search(employee);
                return nulemploy;
            }
        }
        return nulemploy;
    }
}
