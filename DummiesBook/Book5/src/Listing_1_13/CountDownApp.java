/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_13;

/*


In this program whenever the start time for a LaunchEvent arrives, the LaunchEvent class
attempts to abort the countdown.

 */


import java.util.ArrayList;

public class CountDownApp {

    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock(20);
        ArrayList<Runnable> events
                = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16,
                "Flood the pad!", clock));
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
}

interface TimeMonitor {             //Notifies the CountDownTimer Class that the CountDown should be aborted

    int getTime();

    void abortCountDown();  
}

class CountDownClock extends Thread
        implements TimeMonitor {

    private int t;

    public CountDownClock(int start) {
        this.t = start;
    }

    public void run() {
        boolean aborted = false;                  //boolean variable named aborted indicates whether the thread has been interrupted
        for (; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                aborted = true;                        //set to true if interrupted
            }
            if (Thread.interrupted()) {
                aborted = true;                       //set to true if Thread.interrupted() returns true
            }
            if (aborted) {                            //if set to true, prints
                System.out.println(
                        "Stopping the clock!");
                break;                                 //loop is exited
            }
        }
    }

    public int getTime() {
        return t;
    }

    public synchronized void abortCountDown() {   //method is synchronised to avoid it being called by multiple objects at the same time
        Thread[] threads
                = new Thread[Thread.activeCount()];   //creates an array of Thread objects that’s large enough to hold all the active threads
        Thread.enumerate(threads);                    //enumerate method of the Thread class  called to copy all the active threads into the array
        for (Thread t : threads) {                    //used to call the interrupt method on all the active threads. That method shuts down everything.
            t.interrupt();
        }
    }
}

class LaunchEvent implements Runnable {

    private int start;
    private String message;
    TimeMonitor tm;

    public LaunchEvent(int start, String message,
            TimeMonitor monitor) {
        this.start = start;
        this.message = message;
        this.tm = monitor;
    }

    public void run() {
        boolean eventDone = false;
        boolean aborted = false;                             //uses a boolean variable to indicate whether the thread has been interrupted
        while (!eventDone) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                aborted = true;
            }
            if (tm.getTime() <= start) {
                System.out.println(this.message);
                eventDone = true;                       
                System.out.println("ABORT!!!!");
                tm.abortCountDown();
            }
            if (Thread.interrupted()) {
                aborted = true;
            }
            if (aborted) {
                System.out.println(
                        "Aborting " + message);
                break;
            }
        }
    }
}
