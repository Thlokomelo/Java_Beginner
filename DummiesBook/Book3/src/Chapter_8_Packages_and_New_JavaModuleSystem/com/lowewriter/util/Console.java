/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lowewriter.util;

/*
Page: 357

Console class is made available in a package named com.lowewriter.util so that other likeminded
programmers can use it in their programs e.g. the PackageTest class

 */


import java.util.Scanner;

public class Console {

    static Scanner sc = new Scanner(System.in);

    public static boolean askYorN(String prompt) {
        while (true) {
            String answer;
            System.out.print("\n" + prompt
                    + " (Y or N) ");
            answer = sc.next();
            if (answer.equalsIgnoreCase("Y")) {
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}
