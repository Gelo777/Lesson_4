package student.Domain_Layer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository implements DepRepository {

    List<Department> departments;

    @Override
    public void add(Department department) {
        departments.add(department);
    }

    @Override
    public void delete(Department department) {
        departments.remove(department);
    }

    @Override
    public Department search(Department department) {
        return department;
    }

    @Override
    public List<Department> getDepartments() {
        return departments;
    }
}
