package student.Domain_Layer;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

public class Department {

    private String name;
    private int employeeNum;
    private List<Integer> rooms;

    public Department() {
        this.name = null;
        this.employeeNum = 0;
        this.rooms = null;
    }

    public Department(String name, int employeeNum, List<Integer> rooms) {
        this.name = name;
        this.employeeNum = employeeNum;
        this.rooms = rooms;
    }



    public void setName(String name)                {this.name = name;}
    public void setEmployeeNum(int employeeNum)     {this.employeeNum = employeeNum;}
    public void setRooms(List<Integer> rooms)       {this.rooms = rooms;}

    public String getName()             {return name;}
    public int getEmployeeNum()         {return employeeNum;}
    public List<Integer> getRooms()     {return rooms;}

}
