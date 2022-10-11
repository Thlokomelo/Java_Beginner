package Chapter_2_Working_with_File_Streams;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Page: 811

This program writes lines to a text file. The data
written is taken from an array that’s hard-coded into the file.

 */

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {   
        Movie[] movies = getMovies();                                   //returns an array of Movie objects to be written to the file

        //creates a PrintWriter object that the program can use to write data to the file.
        PrintWriter out = openWriter("C:\\Users\\thlok\\Documents\\NetBeansProjects\\Book8\\src\\Chapter_2_Working_with_File_Streams\\movies2.txt");
        
        for (Movie m : movies) {                                       //call the writeMovie method for each movie in the array
            writeMovie(m, out);
        }
        out.close();                                                   //PrintWriter is closed.
    }

    private static Movie[] getMovies() {                              //method returns an array of Movie objects that are written to a file.
        Movie[] movies = new Movie[10];

        movies[0] = new Movie("It's a Wonderful Life",
                1946, 14.95);
        movies[1] = new Movie("Young Frankenstein",
                1974, 16.95);
        movies[2] = new Movie("Star Wars",
                1977, 17.95);
        movies[3] = new Movie("The Princess Bride",
                1987, 16.95);
        movies[4] = new Movie("Glory",
                1989, 14.95);
        movies[5] = new Movie("The Game",
                1997, 14.95);
        movies[6] = new Movie("Shakespeare in Love",
                1998, 19.95);
        movies[7] = new Movie("Zombieland",
                1997, 18.95);
        movies[8] = new Movie("The King's Speech",
                1997, 19.95);
        movies[9] = new Movie("Star Trek Into Darkness",
                1997, 19.95);
        return movies;
    }

    private static PrintWriter openWriter(String name) {          //method creates a PrintWriter object for the filename passed to it as a parameter
        try {
            File file = new File(name);
            PrintWriter out                                       //uses a buffer that’s flushed each time println is called.
                    = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter(file)), true);
            return out;
        } catch (IOException e) {
            System.out.println("I/O Error");
            System.exit(0);
        }
        return null;
    }

    private static void writeMovie(Movie m,                        //method accepts as parameters a Movie object to be written and the PrintWriter to which the movie should be written
            PrintWriter out) {
        
        //creates a string that includes the title, a tab, the year, another tab, and the price
        String line = m.title;
        line += "\t" + Integer.toString(m.year);
        line += "\t" + Double.toString(m.price);
        out.println(line);                                             //writes the string to the file.
    }

    private static class Movie {                                     //inner class that defines a movie object

        public String title;
        public int year;
        public double price;

        public Movie(String title, int year, double price) {        //constructor initialises the fields
            this.title = title;
            this.year = year;
            this.price = price;
        }
    }
}
