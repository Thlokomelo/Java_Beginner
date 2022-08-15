/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Using_Abstract_Classes_and_Interfaces;

/*
Page: 309

Program uses the Timer class to alternately display the messages Tick. . . and Tock. . . 
on the console at 1-second intervals. The JOption Pane class is used to display a dialog box; 
the program runs until the user clicks the OK button in this box.
 */

import java.awt.event.*;                                  //accomodates The ActionListener interface
import javax.swing.*;                                     // accomodates the Timer class

public class TickTock {

    public static void main(String[] args) {
      
        Timer t = new Timer(1000, new Ticker());    //creates a new Timer object, sets timer interval to 1000 milisecons/1 second
                                                    //and passes a new Ticker method as a second parameter
        t.start();                                  //calls the start method to kick the timer into action
       
        JOptionPane.showMessageDialog(null,         //displays a dialog box to prevent the program from ending immediately
        
                "Click OK to exit program");
    }
}

class Ticker implements ActionListener {            //class implements the ActionListerner interface

    private boolean tick = true;           //class field used to keep track of whether the Ticker displays Tick... or Tock...
                                           //toggled whenever the actionPerformed class is called


    public void actionPerformed(ActionEvent event) {      //method called at each timer interval
        if (tick) {
            System.out.println("Tick...");                //Prints if tick is true
        } else {
            System.out.println("Tock...");                //Prints if tick is false          
        }
        tick = !tick;                 //If tick is true, it’s set to false. If tick is false, it’s set to true.
    }
}
