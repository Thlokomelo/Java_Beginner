/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

import java.text.NumberFormat;

/*
Page: 403

Program uses a for loop to print the contents of the sales
array to the console, separated by tabs. Each year is printed on a separate line,
with the year at the beginning of the line. In addition, a line of headings for the
sales regions is printed before the sales data
 */
public class Sales {

    public static void main(String[] args) {

        NumberFormat cf = NumberFormat.getCurrencyInstance();
        System.out.println("\tNorth\t\tSouth\t\tEast\t\tWest");
        int year = 2004;
        double[][] sales
                = {{23853.0, 22838.0, 36483.0, 31352.0}, // 2004
                {25483.0, 22943.0, 38274.0, 33294.0}, // 2005
                {24872.0, 23049.0, 39002.0, 36888.0}, // 2006
                {28492.0, 23784.0, 42374.0, 39573.0}, // 2007
                {31932.0, 23732.0, 42943.0, 41734.0}}; // 2008

        for (int y = 0; y < 5; y++) {
            System.out.print(year + "\t");
            for (int region = 0; region < 4; region++) {
                System.out.print(cf.format(sales[y][region]));
                {
                    System.out.print(cf.format(sales[y][region]));
                    System.out.print("\t");
                }
                year++;
                System.out.println();
            }
        }
    }
}

/*

Alternative: In reverse order

for (int region = 0; region < 4; region++)
{
for (int y = 0; y < 5; y++)
{
System.out.print(cf.format(sales[y][region]));
System.out.print(" ");
}
System.out.println();
}

 */
