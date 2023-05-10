package student.Domain_Layer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Employee {
    String FIO;
    String address;
    String birthDate;
    String position;
    String department;

    public Employee(){
        this.FIO = null;
        this.address = null;
        this.birthDate = null;
        this.position = null;
        this.department = null;
    }

    public Employee(String FIO, String address, String birthDate, String position, String department) {
        this.FIO = FIO;
        this.address = address;
        this.birthDate = birthDate;
        this.position = position;
        this.department = department;
    }

    public void setFIO(String FIO)                      { this.FIO = FIO; }
    public void setAddress(String address)              { this.address = address;}
    public void setBirthDate(String birthDate)          {this.birthDate = birthDate;}
    public void setPosition(String position)            {this.position = position;}
    public void setDepartment(String department)        {this.department = department;}

    public String getFIO()              {return FIO;}
    public String getAddress()          {return address;}
    public String getBirthDate()        {return birthDate;}
    public String getPosition()         {return position;}
    public String getDepartment()       {return department;}
}
