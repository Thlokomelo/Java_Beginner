/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes.Listing_6_1;

/*
Page: 326

program compares two Employee objects by using a properly constructed equals method.

 */
public class TestEquality2 {

    public static void main(String[] args) {
        Employee emp1 = new Employee(                   //1st Employee object is created
                "Martinez", "Anthony");
        Employee emp2 = new Employee(                   //2nd Employee object is created
                "Martinez", "Anthony");
        if (emp1.equals(emp2)) {                        //Compares the two Employee objects                  
            System.out.println(
                    "These employees are the same.");
        } else {
            System.out.println(
                    "These are different employees.");
        }
    }
}

class Employee {                                              //Employee class

    private String lastName;
    private String firstName;

    public Employee(String lastName, String firstName) {     //Employee constructor
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {                           //getter method
        return this.lastName;
    }

    public String getFirstName() {                          //getter method
        return this.firstName;
    }

    public boolean equals(Object obj) {                    //The overriden equals method
        //Set conditions for the override
        
        // an object must equal itself
        if (this == obj) {
            return true;
        }
        // no object equals null
        if (this == null) {
            return false;
        }
        // objects of different types are never equal
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        // cast to an Employee, then compare the fields (FirstName & LastName)
        Employee emp = (Employee) obj;
        return this.lastName.equals(emp.getLastName())
                && this.firstName.equals(emp.getFirstName());
    }
}
