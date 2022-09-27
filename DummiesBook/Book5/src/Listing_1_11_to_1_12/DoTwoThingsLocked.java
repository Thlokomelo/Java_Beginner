/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_11_to_1_12;

/**
 *
 * @author thlok
 */

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThingsLocked {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClockLocked clock
            = new CountDownClockLocked();

    public static void main(String[] args) {
        new DoTwoThingsLocked();
    }

    DoTwoThingsLocked() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
