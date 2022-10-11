/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Working_with_File_Streams;

/*
Page: 804

This program reads the movies.txt file and prints the contents of the file to the console.

 */

import java.io.*;       
import java.text.NumberFormat;

public class ReadFile {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

          //The getReader method is used to create a Buffered Reader object that can read the file.
          BufferedReader in = getReader("C:\\Users\\thlok\\Documents\\NetBeansProjects\\Book8\\src\\Chapter_2_Working_with_File_Streams\\Movies.txt");	

        Movie movie = readMovie(in);                              //readMovie method is used to read each movie from the file
        while (movie != null) {                                   //process each movie
            String msg = Integer.toString(movie.year);
            msg += ": " + movie.title;
            msg += " (" + cf.format(movie.price) + ")";
            System.out.println(msg);
            movie = readMovie(in);  
        }
    }    

    private static BufferedReader getReader(String name) {     //The getReader method creates a BufferedReader object for the filename passed as a parameter.
        BufferedReader in = null;
        try {
            File file = new File(name);
            in = new BufferedReader(
                    new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println(
                    "The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(BufferedReader in) {  //The readMovie method reads a line from the reader passed as a parameter
        String title;
        int year;
        double price;
        String line = "";  //parses the data in the line
        String[] data;     //creates a Movie object from the data

        try {
            line = in.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }

        if (line == null) {
            return null;
        } else {
            data = line.split("\t");   
            title = data[0];                      //name of movie 
            year = Integer.parseInt(data[1]);     //year of movie
            price = Double.parseDouble(data[2]);  //price of the movie
            return new Movie(title, year, price);
        }
    }

    private static class Movie {  //63

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
