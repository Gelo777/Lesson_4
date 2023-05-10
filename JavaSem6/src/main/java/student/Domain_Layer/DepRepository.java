package student.Domain_Layer;

import javax.swing.*;
import java.util.List;

public interface DepRepository {
    void add(Department department);
    void delete(Department department);
    Department search(Department department);
    List<Department> getDepartments();
}
