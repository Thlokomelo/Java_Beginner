/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

import java.util.Arrays;

/**
 *
 * @author thlok
 */
public class Search {

    public static void main(String[] args) {
           int[] lotto = new int[6];
        int lucky = 6;
        int foundAt = -1;
        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] == lucky) {
                foundAt = i;
            }
  
        }
        if (foundAt > -1) {
            System.out.println("My number came up!");
        } else {
            System.out.println("I'm not lucky today.");
        }
        
        
    }

}
