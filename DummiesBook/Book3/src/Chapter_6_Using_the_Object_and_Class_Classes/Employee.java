/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6_Using_the_Object_and_Class_Classes;

/*
Page: 332

Using clone to create a shallow copy

Employee class with a clone method uses super.clone() to clone itself.
This clone method works only for classes whose fields are all either primitive types (int and double)
or immutable objects such as strings.

 */


class Employee implements Cloneable {
// Fields and methods omitted...

    public Object clone() {                             
        Employee emp;
        try {
            emp = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }
}
