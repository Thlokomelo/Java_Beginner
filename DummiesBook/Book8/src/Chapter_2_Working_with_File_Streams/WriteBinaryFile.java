/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Working_with_File_Streams;

/*

Page:  823

program that writes the movies.dat file from an array of
Movie objects whose values are hard-coded into the program.program that writes the movies.dat fileprogram.

 */

import java.io.*;

public class WriteBinaryFile {

    public static void main(String[] args) {                                    //method calls getMovies to get an array of Movie objects
        Movie[] movies = getMovies();
        
        //calls openOutputStream to get an output stream to write data to the file
        DataOutputStream out = openOutputStream("C:\\Users\\thlok\\Documents\\NetBeansProjects\\Book8\\src\\Chapter_2_Working_with_File_Streams\\movies_1.dat");
        for (Movie m : movies) {                                                //calls writeMovie to write the movies to the file
            writeMovie(m, out);
        }
        closeFile(out);                                                         //closes the file
    }

    private static Movie[] getMovies() {                                        //creates an array of movies to be written to the file
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

    private static DataOutputStream
            openOutputStream(String name) {                                     //creates a DataOutputStream object so that the program can write data to the file
        DataOutputStream out = null;
        try {
            File file = new File(name);
            out = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file)));
            return out;
        } catch (IOException e) {
            System.out.println(
                    "I/O Exception opening file.");
            System.exit(0);
        }
        return out;
    }

    private static void writeMovie(Movie m,                                    //The writeMovie method accepts two parameters: the movie to be written 
            DataOutputStream out) {                                            //and the output stream to write the data to
        try {
            out.writeUTF(m.title);
            out.writeInt(m.year);
            out.writeDouble(m.price);
        } catch (IOException e) {
            System.out.println(
                    "I/O Exception writing data.");
            System.exit(0);
        }
    }

    private static void closeFile(DataOutputStream out) {                      //closes the file
        try {
            out.close();
        } catch (IOException e) {
            System.out.println("I/O Exception closing file.");
            System.exit(0);
        }
    }

    private static class Movie {                                               //inner class

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
