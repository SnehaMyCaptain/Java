class EmployeeDetails {  
    //Creating properties of Employee class  
int year, salary;  
String name, address;  
  
//Getter and setters for getting and setting properties  
public int getyear() {  
    return year;  
}  
public void setyear(int year) {  
    this.year = year;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getAddress() {  
    return address;  
}  
public void setAddress(String address) {  
    this.address = address;  
}  

  
//Overriding toString() method  
@Override  
public String toString() {  
    return "Employee [name = " + name + ", year = " + year + ", salary = " + salary + ", address = " + address +"]";  
    }  
      
}  
//Creating main class  
public class Employee{  
    //main() method start  
    public static void main(String args[]) {  
          
        //Creating object of EmployeeDetails class  
        EmployeeDetails emp1 = new EmployeeDetails();  
        EmployeeDetails emp2 = new EmployeeDetails();  
        //Setting values to the properties  
        emp1.setyear(1994);  
        emp1.setName("Robert");  
        
        emp1.setSalary(15000);  
        emp1.setAddress("64C- WallsStreet Sam 2000 68D- WallsStreet"); 
        emp2.setyear(1999);
        emp2.setName("John");
        emp2.setSalary(20000);
        emp2.setAddress("26B- WallsStreet");
        
         
          
        //Showing Employee details  
        System.out.println(emp1);  
        System.out.println(emp2);
          
        
    }  
}  