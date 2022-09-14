/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Creating_Generic_Collection_Classes;

/**
 *
 * @author thlok
 */
public class GenStackTest {

    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<String>();              //GenStack object created to hold string objects
        System.out.println(
                "Pushing four items onto the stack.");
        gs.push("One");                                            //Strings are pushed onto the stack
        gs.push("Two");
        gs.push("Three");
        gs.push("Four");
        System.out.println("There are "                          //Prints the number of items in the stack
                + gs.size() + " items in the stack.\n");
        
        System.out.println("The top item is: "                  //prints the top item
                + gs.peek() + "\n");
        
        System.out.println("There are still "                    //Prints the number of items in the stack
                + gs.size() + " items in the stack.\n");
        
        System.out.println("Popping everything:");
        
        while (gs.hasItems()) {
            System.out.println(gs.pop());                     //loop uses the pop method to pop each item off the stack and print it.
        }
        System.out.println("There are now "                   //Prints the number of items in the stack
                + gs.size() + " items in the stack.\n");
        
        System.out.println("The top item is: "               //prints the top item
                + gs.peek() + "\n");
    }
}
