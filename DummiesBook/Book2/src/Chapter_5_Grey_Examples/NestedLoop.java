/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

public class NestedLoop {

    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {            //Outer Loop
                                                  //For each execution of the outer loop, the inner loop executes 10 times
            for (int y = 1; y < 10; y++) {        //Inner Loop
                                                  
                System.out.print(x + "-" + y + " ");
            }
            System.out.println();    //print forces a line break
        }
    }
}
