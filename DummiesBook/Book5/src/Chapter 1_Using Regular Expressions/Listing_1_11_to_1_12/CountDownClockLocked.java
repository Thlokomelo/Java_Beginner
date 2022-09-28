/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_11_to_1_12;

/*
In this Program When one thread gets the
lock object — by calling lock.lock() at the start of the run method — no other
thread can get past the lock.lock() call. A second thread must wait at the lock.

 */
import java.util.concurrent.locks.ReentrantLock;

public class CountDownClockLocked extends Thread {

    ReentrantLock lock = new ReentrantLock();    //instance of the ReenetrackLock Class is created

    public void run() {
        lock.lock();
        for (int t = 20; t >= 0; t--) {
            System.out.println("T minus " + t);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        lock.unlock();    //the key becomes available only when the first thread reaches the lock.unlock() statement.
    }
}
