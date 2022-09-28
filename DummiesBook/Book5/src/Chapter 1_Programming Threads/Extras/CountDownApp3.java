/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Extras;

/**
 *
 * @author thlok
 */

import java.util.ArrayList;
// version 2.0 of the Countdown application

public class CountDownApp3 {

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);  //constructor accepts a parameter to specify the starting time for the countdown
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();            //An ArrayList of LaunchEvent objects is used to store each launch event
        
        //Add events to the ArrayList
        //method passes the Count Down Clock object as a parameter to the LaunchEvent constructor. 
        //This way the LaunchEvent objects can call the clock’s abort method if necessary
        events.add(new LaunchEvent(16,
                "Flood the pad!", clock));  
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        
        //Starts the clock
        clock.start();
        
        //starts threads to run the LaunchEvent objects
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}

interface TimeMonitor {     //method returns an integer that represents the number of seconds left on the countdown timer

    int getTime();
}

class CountDownClock extends Thread        //The CountDownClock class implements the TimeMonitor interface.
        implements TimeMonitor {

    private int t;                         //Field used to store the current value of the countdown clock

    public CountDownClock(int start) {     //Constructor the current value (t)
        this.t = start;
    }

    public void run() {                              //Run Method
        for (; t >= 0; t--) {                        //tests and decrements the t variable
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public int getTime() {                         //method returns the value of the t variable
        return t;
    }
}

class LaunchEvent implements Runnable {            //the start of the LaunchEvent class

    private int start;
    private String message;
    TimeMonitor tm;                                //accesses the countdown clock

    public LaunchEvent(int start, String message,  //Constructor
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        while (!eventDone) {
            try {
                Thread.sleep(10);                 //checks the countdown clock every 10 milliseconds to see whether its time has arrived
            } catch (InterruptedException e) {
            }
            if (tm.getTime() <= start) {          //calls the getTime method of the countdown clock to see whether it’s time to start the event
                System.out.println(this.message); //If so a message is printed
                eventDone = true;                 // and the event is done and set to true
            }
        }
    }
}
