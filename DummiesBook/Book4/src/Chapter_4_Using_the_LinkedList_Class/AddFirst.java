/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_the_LinkedList_Class;

import java.util.LinkedList;

/*
Page:443

Adding Items to a LinkedList

The addFirst method adds items to the front of the list.
 */
public class AddFirst {

    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");
        officers.addFirst("McIntyre");
        for (String s : officers) {
            System.out.println(s);
        }
    }

}
