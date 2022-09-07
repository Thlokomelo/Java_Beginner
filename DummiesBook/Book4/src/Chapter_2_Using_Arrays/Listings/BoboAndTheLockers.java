/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays.Listings;

/*
Page:398

Program sets up an array of 1,000 booleans. Each represets
a locker: true means open, and false means closed. Then there is a pair of nested
for loops to do the calculation.

 */

public class BoboAndTheLockers {

    public static void main(String[] args) {
        // true = open; false = closed
        boolean[] lockers = new boolean[1001];                                  //Sets up an array of booleans with 1,001 elements.

        // close all the lockers                                                //closes all the lockers.
        for (int i = 1; i <= 1000; i++) {
            lockers[i] = false;
        }
        for (int skip = 1; skip <= 1000; skip++) {                              //Every iteration represents one complete trip through the hallways opening and closing lockers
            System.out.println("Bobo is changing every "
                    + skip + " lockers.");
            for (int locker = skip; locker < 1000;                              //Every iteration represents one stop at a locker on a trip through the hallways
                    locker += skip) {                                           //adds the skip variable to the index variable
                lockers[locker] = !lockers[locker];                             //uses the not operator (!) to reverse the setting of each locker
                                                                                //...Thus, if the locker is open (true), it’s set to closed (false), and vice versa
            }
        }
        System.out.println("Bobo is bored"
                + " now so he's going home.");
        // count and list the open lockers
        String list = "";
        int openCount = 0;
        for (int i = 1; i <= 1000; i++) {                                       //spins through all the lockers and counts the ones that are open
            if (lockers[i]) {
                openCount++;
                list += i + " ";                                                //adds the locker number for each open locker to the end of a string
            }
        }
        System.out.println("Bobo left " + openCount
                + " lockers open.");
        System.out.println("The open lockers are: "
                + list);
    }
}
