/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Regular_Expressions;

/**
 *
 * @author thlok
 */
public class Names1 {

    public static void main(String[] args) {
        

    private static boolean validDroidName(String droid) {
        String regex = "(\\w\\d-\\w\\d)|(\\w-\\d\\w\\w)";
        return droid.matches(regex);
    }
}

}
