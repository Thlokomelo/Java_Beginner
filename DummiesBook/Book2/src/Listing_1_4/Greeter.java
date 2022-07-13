/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listing_1_4;

// This class creates a Greeter object
// that displays a hello message
// in a dialog box.

import javax.swing.JOptionPane;

public class Greeter
{
    public void sayHello()
    {
        JOptionPane.showMessageDialog(null,
            "Hello, World!", "Greeter", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}