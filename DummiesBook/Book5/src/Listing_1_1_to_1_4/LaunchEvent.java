/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Programming_Threads;

/*
Page: 482

To sequence the launch events for the NASA application, We create a Runnable object
named LaunchEvent. The constructor for this class accepts two parameters: the
countdown time at which the event fires and the message that is displayed when
the time arrives. The run method for this class uses Thread.sleep to wait until
the desired time arrives. Then it displays the message.

 */


public class LaunchEvent implements Runnable {            //class implements the Runnable interface

    private int start;                                    //int variable declared
    private String message;                               //String variable declared

    public LaunchEvent(int start, String message) {       //constructor accepts 2 parameters ....
        this.start = start;                               //representing the start time (in seconds)
        this.message = message;                           //string message that’s displayed when the time arrives
    }

    public void run() {                                  //method
        try { 
            Thread.sleep(20000 - (start * 1000));       //method called to put the thread to sleep until the desired countdown time arrives
                                                        //calcultion: method minuses 1000 milliseconds as it counts down
        } catch (InterruptedException e) {
        }
        System.out.println(message);                   //When the thread wakes up, it displays the message passed via its
                                                       //..constructor on the console.
    }
}
