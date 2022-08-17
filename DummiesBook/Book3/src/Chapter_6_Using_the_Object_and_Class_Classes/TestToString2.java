/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 321

- Overriding toString

Example of an Employee class that overrides the toString Method

 */
public class TestToString2 {

    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        return "Employee["
                + this.firstName + " "
                + this.lastName + "]";
    }

//Returns the class name only
    
/*public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + "]";
    }*/
}
