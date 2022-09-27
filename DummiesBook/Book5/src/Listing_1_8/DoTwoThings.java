/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_8;

/**
 *
 * @author thlok
 */
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class DoTwoThings {

    ScheduledThreadPoolExecutor pool
            = new ScheduledThreadPoolExecutor(2);
    CountDownClock clock = new CountDownClock();

    public static void main(String[] args) {
        new DoTwoThings();
    }

    DoTwoThings() {
        pool.execute(clock);
        pool.execute(clock);
        pool.shutdown();
    }
}
