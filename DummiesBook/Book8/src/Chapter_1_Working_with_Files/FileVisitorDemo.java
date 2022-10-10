/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_1_Working_with_Files;

/*
Page 796

This program lists all the files in C:\Windows\System32, including all its subfolders.

 */

import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FileVisitorDemo {

    public static void main(String[] args) {
        Path start = Paths.get("c:\\Windows\\System32");                       //Creates an instance of the Path class that starts the file tree at C:\Windows\ System32
        MyFileVisitor visitor = new MyFileVisitor();                           //Creates an instance of the MyFileVisitor class
        try {
            Files.walkFileTree(start, visitor);                                //Walks the file tree, starting at the directory indicated by start, 
                                                                              //using the MyFileVisitor object created in line 22
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static class MyFileVisitor extends SimpleFileVisitor<Path> {      //class extends SimpleFileVisitor  which is a generic class, so you must specify a type
        public FileVisitResult visitFile(Path file,                           //Overrides the visitFile method, which is called once for each file that is accessed as the file tree is walked
                BasicFileAttributes attr) {
            System.out.println(file.toString());                              //prints the name of the file to the console
            return FileVisitResult.CONTINUE;                                  //Produces the return value of the visitFile method, which is of type FileVisitResult
        }

        public FileVisitResult visitFileFailed(Path file,                     //Overrides the visitFileFailed method, which is called whenever a file can’t be accessed.
                BasicFileAttributes attr) {
            System.out.println(file.toString() + " COULD NOT ACCESS!");       //prints an error message
            return FileVisitResult.CONTINUE;                                 //Produces the return value of the visitFile method, which is of type FileVisitResult
        }

        public FileVisitResult preVisitDirectoryFailed(Path dir,             //Overrides the preVisitDirectoryFailed method, which is called whenever a directory can’t be accessed.
                IOException e) {                                       
            System.out.println(dir.toString() + " COULD NOT ACCESS!");       //prints an error message.
            return FileVisitResult.CONTINUE;                                  //Produces the return value of the visitFile method, which is of type FileVisitResult
        }
    }
}
