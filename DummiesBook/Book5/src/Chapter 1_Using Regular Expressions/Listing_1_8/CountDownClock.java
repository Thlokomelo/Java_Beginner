/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_8;

/*
Program creates an instance of the CountDownClock class

The resulting output is an unpredictable mishmash of two threads’ outputs, with
some of the counts duplicated and others skipped altogether.

The two threads execute their loops simultaneously, so after one thread displays
its T minus 20, the other thread displays its own T minus 20. The same thing
happens for T minus 19, T minus 18, and so on.

 */
public class CountDownClock extends Thread {

    public void run() {
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
