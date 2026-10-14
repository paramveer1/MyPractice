package IO.Serialization;

import java.io.Serializable;

class Employee implements Serializable{
    transient int employee_no  ;
    String name;
    int salary;

    Employee(int employee_no,String name,int salary){
        this.employee_no = employee_no;
        this.name = name;
        this.salary = salary;
    }



}