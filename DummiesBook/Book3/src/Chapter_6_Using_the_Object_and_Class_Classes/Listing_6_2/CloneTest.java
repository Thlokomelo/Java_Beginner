/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes.Listing_6_2;

/*
Page: 329

The Clone Method

Program clones the Employee objects and overrides the clone method for the Employee class.

 */


public class CloneTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(                    //Object 1 created (Mr Martinez)
                "Martinez", "Anthony");
        emp1.setSalary(40000.0);                        // Set Salary for Mr Martinez
        Employee emp2 = (Employee) emp1.clone();        //create a clone and cast the return to an Employee
        emp1.setLastName("Smith");                      //Set LastName (Change) Mr Martinez to Smith
        System.out.println(emp1);                       //Prints emp 1 (Smith)
        System.out.println(emp2);                       //Prints emp 2 (Martinez)
    }
}

class Employee {                                      //Class

    //Declarations
    private String lastName;
    private String firstName;
    private Double salary;

    public Employee(String lastName,                 //Constructor
            String firstName) {
        this.lastName = lastName;                    //constructor Fields
        this.firstName = firstName;
    }

    
    //getter and setter methods
    
    public String getLastName() {                
        return this.lastName;
    }

    public void setLastName(String lastName) {   
        this.lastName = lastName;
    }

    public String getFirstName() {              
        return this.firstName;
    }

    public void setFirstName(String firstName) { 
        this.firstName = firstName;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() {                         //Overrides the clone method
        Employee emp;
        emp = new Employee(                         //creates new object using.. 
                this.lastName, this.firstName);     //..the last name and first name from the current object
        emp.setSalary(this.salary);                 //Sets the new employee’s salary to the current object’s salary
        return emp;                                 //Returns the cloned Employee object
    }

    public String toString() {
        return this.getClass().getName() + "[" +
               this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}
