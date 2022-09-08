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
public class Nums2 {

    public static void main(String[] args) {

        ArrayList<String> nums = new ArrayList<String>();
        nums.add("One");
        nums.add("Two");
        nums.add("Three");
        nums.add("Four");
        nums.add(2, "Two and a half");

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}

/*
Alternative: Using an advanced For Statement
--------------------------------------------

for (String s : nums)
System.out.println(s);

Accessing the index number and the string
-----------------------------------------

for (String s : nums)
{
int i = nums.indexOf(s);
System.out.println("Item " + i + ": " + s);
}


*/
