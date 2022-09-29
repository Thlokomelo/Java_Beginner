package Chapter_3_Using_Recursion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Page: 527

Displaying Directories

This program uses a recursive method to list all the directories that are found starting from a given path.
Indentation is used to show the directory structure.

 */

import java.io.File;                                     //Required to be bale to use the file class
import java.util.Scanner;                       

public class DirList {

    static Scanner sc = new Scanner(System.in); 

    public static void main(String[] args) {
        System.out.print(
                "Welcome to the Directory Lister");
        do {
            System.out.print("\nEnter a path: ");          //A Scanner object is used to get the pathname from the user
            String path = sc.nextLine();

            File dir = new File(path);                     //The pathname is passed to the File class constructor to create a new
                                                           //..File object for the directory entered by the user.
            if (!dir.exists() || !dir.isDirectory()) {     //methods are called to ensure that the path entered by the user exists
                System.out.println(
                        "\nThat directory doesn't exist.");
            } else {
                System.out.println(
                        "\nListing directory tree of:");
                System.out.println(dir.getPath());        //method called to display the name of the path represented by the File object.
                listDirectories(dir, "  ");               //methos is called to list all the subdirectories in the directory 
            }
        } while (askAgain());                             //loop asks the user if they wants to list another directory, 
                                                          //and the loop repeats if the user answers Y.
    }

    private static void listDirectories(                  
            File dir, String indent) {                    //method takes two parameters.
        File[] dirs = dir.listFiles();                    //method is called to get an array of all the File objects in this directory.
        for (File f : dirs) {                             //An enhanced for loop is used to process all the File objects in the array.
            if (f.isDirectory()) {                        //checks to see whether a file is a directory rather than a file
                System.out.println(                       //prints if the file is a directory
                        indent + f.getName());            //prints the string followed by the name of the directory
                listDirectories(f, indent + "  ");        //method is called recursively to list the contents of the f directory with two spaces of indentation
            }
        }
    }

    private static boolean askAgain() {
        System.out.print("Another? (Y or N) ");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")) {
            return true;
        }
        return false;
    }
}
