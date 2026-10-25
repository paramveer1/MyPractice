package CollectionFramework.ComparatorDemo;

public class Employee implements Comparable<Employee> {
    public int compareTo(Employee e1 ){
        return e1.getId()-this.getId();

    }

    Employee(int id,String name, byte age,int salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }
    private  String name ;
    private int id;
    private int salary;
    private byte age;

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }



    public void setId(int id){
        this.id = id;
    }
    public  int getId(){
        return  id;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }


    public void setAge(byte age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return "Id = "+id + ",  Name ="+name+", Age = "+ age+", Salary = " + salary +" \n";

    }

    

    
}
