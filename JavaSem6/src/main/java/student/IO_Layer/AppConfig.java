package student.IO_Layer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import student.Appliation_Services_Layer.ApplicationService;
import student.Appliation_Services_Layer.ApplicationServiceInterface;
import student.Domain_Layer.DepRepository;
import student.Domain_Layer.DepartmentRepository;
import student.Domain_Layer.EmpRepository;
import student.Domain_Layer.EmployeeRepository;

@Configuration
public class AppConfig {

    @Bean
    ApplicationServiceInterface applicationServiceInterface(){
        return new ApplicationService();
    }

    @Bean
    DepRepository depRepository(){
        return new DepartmentRepository();
    }

    @Bean
    EmpRepository empRepository(){
        return new EmployeeRepository();
    }
}


