/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_5_Grey_Examples;

import java.util.Scanner;

public class GetABet {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 1000;             // assume the user has $1,000
        int bet;                     // the bet entered by the user
        System.out.println("You can bet between 1 and "
                + bank);
        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
        } while ((bet <= 0) || (bet > bank));             //while-loop with expression that validates the input data
        System.out.println("Your money's good here.");
    }
}
