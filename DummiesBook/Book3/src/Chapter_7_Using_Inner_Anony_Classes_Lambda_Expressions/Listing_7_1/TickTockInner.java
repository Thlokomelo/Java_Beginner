/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_7_Using_Inner_Anony_Classes_Lambda_Expressions.Listing_7_1;

/*
Page 343

Understanding Inner classes
Programme shows a version of an application that implements the Ticker class
as an inner class.
 */
import java.awt.event.*;
import javax.swing.*;

public class TickTockInner {

    private String tickMessage = "Tick...";                  //string variable with message to be printed	
    private String tockMessage = "Tock�";	            //string variable with message to be printed

    public static void main(String[] args) {
        TickTockInner t = new TickTockInner();              //instance of application created within main method
        t.go();	                                           //executes the go method of the new instance of the TickTockInner class.

    }

    private void go() //go method called above
    {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new Ticker());
        t.start();

        // display a message box to prevent the
        // program from ending immediately
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
        System.exit(0);
    }

    class Ticker implements ActionListener                   //declaration for the inner class named Ticker
    {

        private boolean tick = true;

        public void actionPerformed(ActionEvent event)       //called by the Timer object every 1,000 milliseconds.	
        {
            if (tick) {
                System.out.println(tickMessage);             //the inner class directly accesses a field of the outer class. 

            } else {
                System.out.println(tockMessage);              //the inner class directly accesses a field of the outer class. 
            }
            tick = !tick;
        }
    }
}
