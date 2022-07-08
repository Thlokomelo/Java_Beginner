package ex13_1_exercise;


import java.util.*;

public class ShoppingCart {
    public static void main(String[] args){
        
            String[] days = {"monday","saturday","tuesday","sunday","friday"};            
           
   
              // Convert the days array into an ArrayList
            ArrayList<String> dayList = new ArrayList(Arrays.asList(days));
           
            for (String s : dayList){      // Loop through the ArrayList, printing out "sunday" elements in 
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());  // upper case (use toUpperCase() method of String class)
               }
               
               else System.out.println(s); // Print all other days in lower case 
            }
            System.out.println(dayList);    // Print out the ArrayList           
    }
}
