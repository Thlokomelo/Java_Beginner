/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_1_to_1_4;

/*
Page: 479

This program is from a developing software of NASA, whereby it has to 
control the final 31 seconds of the countdown for a manned spacecraft.
The software has to coordinate several key events that occur when the clock
reaches certain points.

This is  version 1 of the CountDownClock class that extends the Thread class.
 */


public class CountDownClock extends Thread                 //class extends the Thread class	
{

    public void run() {                                    //method is called by Java when the clock thread has been started
        for (int t = 20; t >= 0; t--) {                    //for loop counts down from 20 to 0
            System.out.println("T minus " + t);           
            try {
                Thread.sleep(1000);                       //The CountDownClock class uses the sleep method to pause for 1 second.
            } catch (InterruptedException e) {            //handles exceptions
            }
        }
    }
}

