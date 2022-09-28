/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_9_to_1_10;

/*
In this program Java’s synchronized keyword ensures that only one thread at a
time calls the run method. The resulting output shows one complete execution of
the run method followed by another.
 */

class CountDownClockSync extends Thread {

    private int start;

    public CountDownClockSync(int start) {
        this.start = start;
    }

    synchronized public void run() {
        for (int t = start; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
