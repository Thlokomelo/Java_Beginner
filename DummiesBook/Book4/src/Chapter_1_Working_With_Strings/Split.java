/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter1_Working_With_Strings;

/**
 * Page: 384
 
 * Splitting a string
 
 */
public class Split {

    public static void main(String[] args) {
        String address
                = "1500 N. Third Street:Fresno:CA:93722";

        String[] parts = address.split(":");

        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
        }
    }

}
