/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_2_4;

import javax.swing.JOptionPane;	              //imports the JOptionPane class

public class DialogApp
{
    public static void main(String[] args)
    {
        String s;
        s = JOptionPane.showInputDialog	     //statement displays an input dialog box
                ("Enter an integer:");	     //with the prompt Enter an integer
        int x = Integer.parseInt(s);	     //assigns the string entered by the user to the variable named s.
        System.out.println("You entered " + x + ".");
    }
}

/*
- parseInt method of the Integer class is used to
convert the string entered by the user to an integer.
*/