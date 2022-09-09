/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_the_LinkedList_Class;

import java.util.LinkedList;

/*
Page: 447

Updating LinkedList Items

using the set method to relace/update elements
 */
public class Update {

    public static void main(String[] args) {
        LinkedList<String> officers = new LinkedList<String>();
// add the original officers
        officers.add("Blake");
        officers.add("Burns");
        officers.add("Tuttle");
        officers.add("Houlihan");
        officers.add("Pierce");
        officers.add("McIntyre");
        System.out.println(officers);
        
// replace Tuttle with Murdock
        officers.set(2, "Murdock");
        System.out.println("\nTuttle is replaced:");
        System.out.println(officers);
    }
}
