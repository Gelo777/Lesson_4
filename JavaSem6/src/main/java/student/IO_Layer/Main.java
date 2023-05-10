package student.IO_Layer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import student.Appliation_Services_Layer.ApplicationService;
import student.Appliation_Services_Layer.ApplicationServiceInterface;
import student.Domain_Layer.Department;
import student.Domain_Layer.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationServiceInterface service = applicationContext.getBean(ApplicationService.class);

        System.out.println("-----This is JavaApplication-----\n");
        Scanner in = new Scanner(System.in);
        while(true){

            System.out.println("Enter 'aD': add Department");
            System.out.println("Enter 'dD': delete Department");
            System.out.println("Enter 'sD': search for Department");
            System.out.println("Enter 'aE': add Employee");
            System.out.println("Enter 'dE': delete Employee");
            System.out.println("Enter 'sE': search for Employee");
            System.out.println("Enter 'e': exit");

            String enter = in.next();
            switch (enter){
                case("aD"):{
                    String name;
                    System.out.println("Enter name: ");
                    name = in.next();

                    int people;
                    System.out.println("Enter number of people: ");
                    people = in.nextInt();

                    List<Integer> rooms = new ArrayList<>();
                    int room = -1;
                    System.out.println("Enter rooms number: ");
                    while(room != 0){
                        room = in.nextInt();
                        if(room != 0){
                            rooms.add(room);
                        }
                    }
                    Department department = new Department(name,people,rooms);
                    service.addDepartment(department);
                    break;

                }
                case("dD"):{

                    String name;
                    System.out.println("Enter name: ");
                    name = in.next();
                    service.deleteDepartment(name);
                    break;

                }
                case("sD"):{

                    String name;
                    System.out.println("Enter name: ");
                    name = in.next();
                    Department department;
                    department = service.searchDepartment(name);
                    System.out.println("Department: ");
                    System.out.println("   " + department.getName());
                    System.out.println("   " + department.getEmployeeNum());
                    System.out.println("   " + department.getRooms());
                    break;

                }
                case("aE"):{
                    String FIO;
                    System.out.println("Enter FIO: ");
                    FIO = in.next();

                    String address;
                    System.out.println("Enter address: ");
                    address = in.next();

                    String birthDate;
                    System.out.println("Enter birth date: ");
                    birthDate = in.next();

                    String position;
                    System.out.println("Enter position: ");
                    position = in.next();

                    String department;
                    System.out.println("Enter department name: ");
                    department = in.next();
                    Employee employee = new Employee(FIO,address,birthDate,position,department);
                    service.addEmployee(employee);
                    break;


                }
                case("dE"):{
                    String FIO;
                    System.out.println("Enter FIO: ");
                    FIO = in.next();
                    service.deleteEmployee(FIO);
                    break;
                }
                case("sE"):{
                    String FIO;
                    System.out.println("Enter FIO: ");
                    FIO = in.next();
                    Employee employee = service.searchEmployee(FIO);
                    System.out.println("Employee: ");
                    System.out.println("   " + employee.getFIO());
                    System.out.println("   " + employee.getAddress());
                    System.out.println("   " + employee.getBirthDate());
                    System.out.println("   " + employee.getPosition());
                    System.out.println("   " + employee.getDepartment());
                    break;

                }
                case("e"):{
                    break;
                }
                default:
                    break;
            }
            if(enter.equals("e")){
                break;
            }
            System.out.println("Enter 'enter' to continue: ");
            enter = in.next();
            System.out.println();
        }
        System.out.println("-----This the end of JavaApplication-----\n");
    }
}
