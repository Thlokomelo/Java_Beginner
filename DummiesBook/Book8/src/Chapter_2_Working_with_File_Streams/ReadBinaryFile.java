/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Working_with_File_Streams;

/*
Page: 817

This program reads the movies.dat file; creates a Movie object for each title, year, and price
value; and prints a line on the console for each movie.

 */

import java.io.*;
import java.text.NumberFormat;

public class ReadBinaryFile {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        //get a data input stream object to read the file
        DataInputStream in = getStream("C:\\Users\\thlok\\Documents\\NetBeansProjects\\Book8\\src\\Chapter_2_Working_with_File_Streams\\movies.dat");

        boolean eof = false;
        while (!eof) {
            Movie movie = readMovie(in);                              //calls a method named readMovie to get a movie object
            if (movie == null) {
                eof = true;
            } else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += " (" + cf.format(movie.price) + ")";
            }
        }
        closeFile(in);                                                           //closes the file
    }

    private static DataInputStream getStream(String name) {                     //creates a DataInputStream object for the filename passed as a parameter
        DataInputStream in = null;
        try {
            File file = new File(name);
            in = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(DataInputStream in) {                        //reads the data for a single movie and creates a Movie object
        String title = "";
        int year = 0;;
        double price = 0.0;;

        try {
            title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        } catch (EOFException e) {
            return null;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    private static void closeFile(DataInputStream in) {                         //method closes the input stream
        try {
            in.close();
        } catch (IOException e) {
            System.out.println("I/O Error closing file.");
            System.out.println();
        }
    }

    private static class Movie {                                                //private inner class

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
