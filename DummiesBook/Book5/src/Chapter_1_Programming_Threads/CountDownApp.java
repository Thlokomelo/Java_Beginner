/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Programming_Threads;

/*
Page: 480

Starts the Thread in the CountDownClock class

 */

public class CountDownApp {

    public static void main(String[] args) {
        Thread clock = new CountDownClock();          //variable of type Thread is declared 
                                                      //and an instance of the Count Down-Clock is created and assigned to it
        clock.start();                                     
    }
}
