/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_2__1_3;

// This application displays a hello message on	
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method.

public class HelloApp2	
{
    public static void main(String[] args)      	
    {
        Greeter myGreeterObject = new Greeter(); 	
        myGreeterObject.sayHello();                //displays the message	
    }
}


/* 
- public static void main(String[] args): declares main method

- Greeter myGreeterObject = new Greeter(): creates a variable named
myGreeterObject that can hold objects created from the Greeter class

- Then it creates a new object (= new Greeter();) using the Greeter class and assigns this
object to the myGreeterObject variable
*/