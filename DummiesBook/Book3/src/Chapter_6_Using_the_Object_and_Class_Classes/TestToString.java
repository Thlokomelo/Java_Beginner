/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 320

- Using the toString method

  This code creates a new Employee object; then the result of its toString method
  is printed to the console.

  E.g. Console Result: Employee@82ba41  (the hashcode 82ba41 will be different in every computer)

 */
public class TestToString {

    public static void main(String[] args) {
        Employee emp = new Employee("Martinez",
                "Anthony");
        System.out.println(emp.toString());
      //System.out.println(emp);             //printIn automatcally calls the toString method of any object you pass it
    }
}

class Employee {

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
