/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 323

The equality Method

Program uses the equality operator to test equality of objects

 */

public class TestEquality1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(       //Refers to Object 1
                "Martinez", "Anthony");
        Employee emp2 = new Employee(       //Refers to Object 2
                "Martinez", "Anthony");
        if (emp1 == emp2) {
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
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
