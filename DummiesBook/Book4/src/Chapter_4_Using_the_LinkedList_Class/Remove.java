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
public class Remove {

    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
// add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println("\nOfficers before removal: ");
        System.out.println(officers);

// removing officers
        officers.remove(3);          //removes item at index 3
      //  officers.remove("Tuttle");   //removes specified name
       // officers.clear();            //removes all items
        
        
        System.out.println("\nOfficers after removal: ");
        System.out.println(officers);
    }
}
