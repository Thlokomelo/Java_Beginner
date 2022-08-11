/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 290

Determining an Object’s Type

- To tell what type of object has been assigned to a variable, the instanceof operator is used.


Example:

Employee emp = getEmployee();
String msg;
if (emp instanceof SalariedEmployee)   //determines the type of the object returned by the getEmployee method
{
msg = "The employee's salary is ";
msg += ((SalariedEmployee) emp).getFormattedSalary();
}
else
{
msg = "The employee's hourly rate is ";
msg += ((HourlyEmployee) emp).getFormattedRate();
}
System.out.println(msg);
















*/