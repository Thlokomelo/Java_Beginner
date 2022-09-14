/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Creating_Generic_Collection_Classes;

/*
Page: 459

A Generic Queue Class

The GenQueue class uses a LinkedList to implement its queue
 */

public class GenQueueTest {                      

    public static void main(String[] args) {
        GenQueue<Employee> empList;                             //GenQueue object created that can hold Employee objects               
        empList = new GenQueue<Employee>();                     //queue is assigned to a variable named empList
        GenQueue<HourlyEmployee> hList;                         //GenQueue object created that can hold HourlyEmployee objects   
        hList = new GenQueue<HourlyEmployee>();                 //queue is assigned to a variable named hList
        
        //Employees are created and added to the hList queue
        hList.enqueue(new HourlyEmployee(
                "Trump", "Donald"));
        hList.enqueue(new HourlyEmployee(
                "Gates", "Bill"));
        hList.enqueue(new HourlyEmployee(
                "Forbes", "Steve"));
        
        empList.addItems(hList);                             //addItems method of the empList queue is called to transfer employees from the hList queue to the empList queue
        
        while (empList.hasItems()) {                         //Loop used to print employees that are in the emplist queue
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName
                    + " " + emp.lastName);
        }
    }
}

class Employee {                                       //Employee class

    public String lastName;
    public String firstName;

    public Employee() {
    }

    public Employee(String last, String first) {   //Employee Constructor
        this.lastName = last;
        this.firstName = first;
    }

    public String toString() {                    //ToString method to convert our results to a string
        return firstName + " " + lastName;
    }
}

class HourlyEmployee extends Employee {         //HourlyEmployee class (Subclass of Employee class)

    public double hourlyRate;

    public HourlyEmployee(String last, String first) {          //constructor
        super(last, first);
    }
}
