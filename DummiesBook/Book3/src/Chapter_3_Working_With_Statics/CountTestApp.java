/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Working_With_Statics;

/*
Page: 271

Counting Instances

- Program keeps track of how many times its constructor has been called

 */
public class CountTestApp {                        //Start of the CountTestApp class, Tests the CountTest class.

    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();   //Creates an instance of the CountTest class. 10 instances are created.
            printCount();                    //calls the printCount method, prints the number of CountTest objects that 
        }                                    //..have been created so far.
    }

    private static void printCount() {
        System.out.println("There are now "              //prints a message indicating how many CountTest objects have been created so far.
                + CountTest.getInstanceCount()           //..It calls the static getInstanceCount method of the CountTest class 
                + " instances of the CountTest class."); //..to get the instance count.
    }
}

class CountTest {                                      //Start of the countTest class.

    private static int instanceCount = 0;             //The static instanceCount variable stores the instance count.
                   
    public CountTest() {                         //Constructor: 
        instanceCount++;                        //each time a new instance of the class is created, the instance count is incremented.
    }

    public static int getInstanceCount() {     //getter method
        return instanceCount;                  //returns the value of the static instanceCount field.
    }
}
