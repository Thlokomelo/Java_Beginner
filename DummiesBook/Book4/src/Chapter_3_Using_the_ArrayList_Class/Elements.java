/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_3_Using_the_ArrayList_Class;

import java.util.ArrayList;

/**
 *
 * @author thlok
 */
public class Elements {

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<String>();
        nums.clear();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        System.out.println(nums);
        nums.set(0, "Uno");
        nums.set(1, "Dos");
        nums.set(2, "Tres");
        System.out.println(nums);
    }
}



