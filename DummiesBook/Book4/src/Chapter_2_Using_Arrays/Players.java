/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/**
 *
 * @author thlok
 */
import java.util.Scanner;

public class Players {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String[] players = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine(); // sc is a Scanner
        }
    }

}
