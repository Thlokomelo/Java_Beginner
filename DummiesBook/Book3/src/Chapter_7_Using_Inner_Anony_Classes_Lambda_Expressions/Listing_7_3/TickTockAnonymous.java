/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_7_Using_Inner_Anony_Classes_Lambda_Expressions.Listing_7_3;

/*
Page: 349
Using Anonymous Inner Classes
Program shows a more complex example of an anonymous class: a version of
the Tick Tock application that uses an anonymous class as the action listener for
the timer.
 */
import java.awt.event.*;
import javax.swing.*;

public class TickTockAnonymous {

    private String tickMessage = "Tick . . .";                          //Static variable declared and instatiated
    private String tockMessage = "Tock . . .";                          //Static variable declared and instatiated

    public static void main(String[] args) {                            //Main method
        TickTockAnonymous t = new TickTockAnonymous();                  //creates an instance of the TickTockAnonymous class
        t.go();                                                         //executes the go method.

    }

    private void go() {                                                   //go method
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000,                                        //instnace of timer class is created
                new ActionListener()                                    //method parameter that implements the ActionListener interface. Created via the anonymous class
                                                                         //..ActionListener is specified as the type for this class.
                   {                                                      //brace { indicates the beginning of an anonymous class.
            private boolean tick = true;

            public void actionPerformed(                                  //method is called every 1,000 milliseconds by the timer.
                                                                          //method can freely access fields defined in the outer class.
                    ActionEvent event) {                                  //parameter
                if (tick) {
                    System.out.println(tickMessage);
                } else {
                    System.out.println(tockMessage);
                }
                tick = !tick;
            }
        });                                                //brace } marks the end of the body of the anonymous class.
        
        t.start();
        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }
}
