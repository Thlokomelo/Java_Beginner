/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays;

/*
Page 406

Using Jagged Arrays (Arrays with different string lenghts)

Here each nested array initializer indicates the number of strings for each subarray.
The first subarray has two strings, the second has three strings, and so on.
 */
public class JaggedArray {

    public static void main(String[] args) {
        String[][] teams
                = {{"Henry Blake", "Johnny Mulcahy"},
                {"Benjamin Pierce", "John McIntyre",
                    "Jonathan Tuttle"},
                {"Margaret Houlihan", "Frank Burns"},
                {"Max Klinger", "Radar O'Reilly",
                    "Igor Straminsky"}};

        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                System.out.println(teams[i][j]);
            }
            System.out.println();
        }
    }

}
