/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Using_the_ArrayList_Class;

import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.*;



/**
 *
 * @author thlok
 */
public class Iterator {

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        
        String s;
        java.util.Iterator<String> e = nums.iterator();
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }
    }
}
