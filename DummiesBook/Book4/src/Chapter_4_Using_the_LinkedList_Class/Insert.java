/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_the_LinkedList_Class;

import java.util.LinkedList;

/**
 *
 * @author thlok
 */
public class Insert {

    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        officers.add(2, "Tuttle");
        for (String s : officers) {
            System.out.println(s);
        }
    }

}
