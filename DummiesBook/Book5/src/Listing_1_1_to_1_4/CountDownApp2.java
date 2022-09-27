/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Programming_Threads;

import java.util.ArrayList;

/*
Page: 483

This program uses the LaunchEvent and CountDownClock classes to launch the spacecraft
 */
public class CountDownApp2 {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();            //instance of the CountDownClock class is created and saved in the clock variable

        //three LaunchEvent objects are created
        Runnable flood, ignition, liftoff;

        flood = new LaunchEvent(16, "Flood the pad!");   //floods the pad at 16 seconds (Object is assigned to variable of type Runnable) 
        ignition = new LaunchEvent(6, "Start engines!"); //starts the engines at 6 seconds (Object is assigned to variable of type Runnable)
        liftoff = new LaunchEvent(0, "Liftoff!");        //lifts off at 0 seconds (Object is assigned to variable of type Runnable)
        clock.start();                                   //The clock thread is started. The countdown starts ticking.

        //the program starts the three LaunchEvent objects as threads -> 1
        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start(); 

        //Alternative using an Arraylist to store the LaunchEvent objects
       /* Thread clock = new CountDownClock();
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16, "Flood the pad!"));
        events.add(new LaunchEvent(6, "Start engines!"));
        events.add(new LaunchEvent(0, "Liftoff!"));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start(); */
        }

    }


/*
1.
creats a new instance of the Thread class, passing the
LaunchEvent objects as parameters to the Thread constructor, and then
calling the start method to start the thread.
 */
