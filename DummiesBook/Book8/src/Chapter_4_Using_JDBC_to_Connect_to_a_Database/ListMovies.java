/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_JDBC_to_Connect_to_a_Database.Notes;

/*
Page: 852

This program reads data from the movies database and lists it on the console.
 */

import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {

    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();

        ResultSet movies = getMovies();
        try {
            while (movies.next()) {                               //processes each row in a result set
                Movie m = getMovie(movies);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price) + ")";
                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() {
        Connection con = getConnection();
        try {
            //Executes your select statement
            Statement s = con.createStatement();
            String select = "Select title, year, price "
                    + "from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static Connection getConnection() {
        Connection con = null;
        try {
            //registers the driver class so the class is available
            Class.forName("org.postgresql.Driver");                            
           
            //opens the connection
            String url = "jdbc:postgresql://localhost:5432/movies";
            String user = "postgres";
            String pw = "admin";
            con = DriverManager.getConnection(url, user, pw);
            
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        return con;
    }

    private static Movie getMovie(ResultSet movies) {     //gets data from a result set
        try {
            String title = movies.getString("Title");
            int year = movies.getInt("Year");
            double price = movies.getDouble("Price");
            return new Movie(title, year, price);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static class Movie {

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
