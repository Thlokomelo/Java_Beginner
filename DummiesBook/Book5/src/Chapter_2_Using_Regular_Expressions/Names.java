/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Regular_Expressions;

/**
 *
 * @author thlok
 */
public class Names {

    public static void main(String[] args) {

        String s = "One:Two;Three|Four\tFive";
        String regex = "[:;|\\t]";
        String strings[] = s.split(regex);
        for (String word : strings) {
            System.out.println(word);
        }
    }

}
