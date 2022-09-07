/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_2_Using_Arrays.Listings;

/*
Page 410

Program uses a two-dimensional array to represent a chessboard. Its sole purpose is to figure out the
possible moves for a knight (that’s the horsey, for the non-chess players among
us), given its starting position. The user is asked to enter a starting position (such
as f1), and the program responds by displaying the possible squares. Then the
program prints out a crude-but-recognizable representation of the board, with
the knight’s position indicated with an X and each possible move indicated with a
question mark (?).

 */
import java.util.Scanner;

public class KnightMoves {

    static Scanner sc = new Scanner(System.in);

    // the following static array represents the 8
    // possible moves a knight can make
    // this is an 8 x 2 array
    static int[][] moves = {{-2, +1},     //10 declares a two-dimensional array that’s used to store the possible moves for a knight in terms of x and y.
    {-1, +2},
    {+1, +2},
    {+2, +1},
    {+2, -1},
    {+1, -2},
    {-1, -2},
    {-2, -1}};

    public static void main(String[] args) {
        System.out.println("Welcome to the "
                + "Knight Move calculator.\n");
        do {
            showKnightMoves();                                                  //26 Call the method that calculates the moves
        } while (getYorN("Do it again?"));                                      //and calls the method to displays a prompt on-screen and asks the user to enter Y or N.
    }

    public static void showKnightMoves() {                                      //31 method called in line 33
        // The first dimension is the file (a, b, c, etc.)
        // The second dimension is the rank (1, 2, 3, etc.)
        // Thus, board[3][4] is square d5. 
        // A value of 0 means the square is empty
        // 1 means the knight is in the square
        // 2 means the knight could move to the square
        int[][] board = new int[8][8];                                          //39 2-D array with eight rows for the ranks and eight columns for the files

        String kSquare; // the knight's position as a square
        Pos kPos;       // the knight's position as a Pos

        // get the knight's initial position
        do {                                                                    //45 This do loop prompts the user for a valid square to plant the knight in.
            System.out.print("Enter knight's position: ");
            kSquare = sc.nextLine();                                            //accepts user input
            kPos = convertSquareToPos(kSquare);                                 //Variable assigned to method that converts the user’s entry (such as e4) to a Pos object
        } while (kPos == null);                                                 //method returns null if the user enters an incorrect square

        board[kPos.x][kPos.y] = 1;                                              //52 The board position entered by the user is set to 1 to indicate the
                                                                                //..position of the knight.
        System.out.println("\nThe knight is at square "
                + convertPosToSquare(kPos));
        System.out.println(
                "From here the knight can move to:");
        for (int move = 0; move < moves.length; move++) {                       //59 Tests all the possible moves for the knight to see whether they’re valid from the knight’s current position
            int x, y;
            x = moves[move][0];  // the x for this move
            y = moves[move][1];  // the y for this move
            Pos p = calculateNewPos(kPos, x, y);                                //method is called, accepts board position, x, y to indicate where the Knight can move
            if (p != null) {                                                    //if move is illegal/off the board
                System.out.println(convertPosToSquare(p));                      //if move is legal, prints position on board (e.g. c3)
                board[p.x][p.y] = 2;                                            //Then it marks the board pos represented by the move with 2 to indicate that the knight can move to this square.
            }
        }

        printBoard(board);                                                      //72 method is called to print the board array

    }

    // this method converts squares such as a1 or d5 to
    // x, y coordinates such as [0][0] or [3][4]
    public static Pos convertSquareToPos(String square) {                       //78 converts a string such as a1 or e4 to a Pos object representing the same position
        int x = -1;                                                             //one square left
        int y = -1;                                                             //one square left
        char rank, file;                                                        //row, column

        file = square.charAt(0);                                                //intatiate column 
        if (file == 'a') {
            x = 0;
        }
        if (file == 'b') {
            x = 1;
        }
        if (file == 'c') {
            x = 2;
        }
        if (file == 'd') {
            x = 3;
        }
        if (file == 'e') {
            x = 4;
        }
        if (file == 'f') {
            x = 5;
        }
        if (file == 'g') {
            x = 6;
        }
        if (file == 'h') {
            x = 7;
        }

        rank = square.charAt(1);
        if (rank == '1') {
            y = 0;
        }
        if (rank == '2') {
            y = 1;
        }
        if (rank == '3') {
            y = 2;
        }
        if (rank == '4') {
            y = 3;
        }
        if (rank == '5') {
            y = 4;
        }
        if (rank == '6') {
            y = 5;
        }
        if (rank == '7') {
            y = 6;
        }
        if (rank == '8') {
            y = 7;
        }

        if (x == -1 || y == -1) {
            return null;                                                        //If user enters an incorrect square
        } else {
            return new Pos(x, y);                                               //If user enters a correct square
        }
    }

    // this method converts x, y coordinates such as
    // [0][0] or [3][4] to squares such as a1 or d5.
    public static String convertPosToSquare(Pos p) {                               //114 method
        String file = "";

        if (p.x == 0) {
            file = "a";
        }
        if (p.x == 1) {
            file = "b";
        }
        if (p.x == 2) {
            file = "c";
        }
        if (p.x == 3) {
            file = "d";
        }
        if (p.x == 4) {
            file = "e";
        }
        if (p.x == 5) {
            file = "f";
        }
        if (p.x == 6) {
            file = "g";
        }
        if (p.x == 7) {
            file = "h";
        }

        return file + (p.y + 1);
    }

    // this method calculates a new Pos given a    
    // starting Pos, an x move, and a y move
    // it returns null if the resulting move would
    // be off the board.
    public static Pos calculateNewPos(Pos p, int x, int y) {                      //134 method
        // rule out legal moves : indexes 0 to 7
        if (p.x + x < 0) {
            return null;
        }
        if (p.x + x > 7) {
            return null;
        }
        if (p.y + y < 0) {
            return null;
        }
        if (p.y + y > 7) {
            return null;
        }

        // return new position
        return new Pos(p.x + x, p.y + y);
    }

    public static void printBoard(int[][] b) {                                  //150 method prints the board in reverse order so that the first rank prints at the bottom
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                if (b[x][y] == 1) {
                    System.out.print(" X ");
                } else if (b[x][y] == 2) {
                    System.out.print(" ? ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public static boolean getYorN(String prompt) {                              //167 method displays a prompt screen (Y or N)
        while (true) {            
            String answer;                                                      //declares string variable
            System.out.print("\n" + prompt + " (Y or N) ");                     //print the promt + Y or N
            answer = sc.nextLine();                                             //accepts user input
            if (answer.equalsIgnoreCase("Y")) {                                 
                return true;
            } else if (answer.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }
}

// this class represents x, y coordinates on the board
class Pos {                                                                     //183 Class with 2 public fields

    public int x;
    public int y;

    public Pos(int x, int y) {                                                  //constructor
        this.x = x;
        this.y = y;
    }
}







/*
→10 This line declares a two-dimensional array that’s used to store the
possible moves for a knight in terms of x and y. The knight’s move of two
squares left and one square up, for example, is represented as {–2, 1}.
There are a total of eight possible moves, and each move has two values
(x and y). So this two-dimensional array has eight rows and two columns.

→26 The code that gets the user’s starting position for the knight and does
all the calculations is complicated enough that I didn’t want to include it
in the main method, so I put it in a separate method named showNightMoves.
That way, the do loop in the main method is kept simple. It
just keeps going until the user enters N when getYorN is called.

→31 The showNightMoves method begins here.

→39 The board array represents the chessboard as a two-dimensional array
with eight rows for the ranks and eight columns for the files. This array
holds int values. A value of 0 indicates that the square is empty. The
square where the knight resides gets a 1, and any square that the
knight can move to gets a 2.

→45 This do loop prompts the user for a valid square to plant the knight in.
The loop includes a call to the method convertSquareToPos, which
converts the user’s entry (such as e4) to a Pos object. (The Pos class is
defined later in the program; it represents a board position as an x, y
pair.) This method returns null if the user enters an incorrect square,
such as a9 or x4. So to get the user to enter a valid square, the loop just
repeats if the converSquareToPos returns null.

→52 The board position entered by the user is set to 1 to indicate the
position of the knight.

→59 A for loop is used to test all the possible moves for the knight to see
whether they’re valid from the knight’s current position, using the moves
array that was created way back in line 10. In the body of this loop, the
calculateNewPos method is called. This method accepts a board position
and x and y values to indicate where the knight can be moved. If the
resulting move is legal, it returns a new Pos object that indicates the
position the move leads to. If the move is not legal (that is, it takes the
knight off the board), the calculateNewPos method returns null.
Assuming that calculateNewPos returns a non-null value, the body of
this loop prints the square (it calls convertPosTosquare to convert the
Pos object to a string, such as c3). Then it marks the board position
represented by the move with 2 to indicate that the knight can move to
this square.

→72 After all the moves are calculated, the printBoard method is called to
print the board array.

→78 This is the convertSquareToPos method. It uses a pair of brute-force if
statements to convert a string such as a1 or e4 to a Pos object representing
the same position. I probably could have made this method a
little more elegant by converting the first letter in the string to a Char
and then subtracting the offset of the letter a to convert the value to a
proper integer. But I think the brute-force method is clearer, and it
requires only a few more lines of code.
Note that if the user enters an incorrect square (such as a9 or x2), null is
returned.

→114 This is the convertPosToSquare method, which does the opposite of
the convertSquareToPos method. It accepts a Pos argument and
returns a string that corresponds to the position. It uses a series of
brute-force if statements to determine the letter that corresponds to
the file but does a simple addition to calculate the rank. (The Pos
object’s y member is an array for the y position. Array indexes are
numbered starting with 0, but chess rank numbers start with 1. That’s
why 1 is added to the y position to get the rank number.)

→134 The calculateNewPos method accepts a starting position, an x offset,
and a y offset. It returns a new position if the move is legal; otherwise it
returns null. To find illegal moves, it adds the x and y offsets to the
starting x and y position and checks to see whether the result is less
than 0 or greater than 7. If the move is legal, it creates a new Pos object
whose position is calculated by adding the x and y offsets to the x and
y values of the starting position.

→150 The printBoard method uses a nested for loop to print the board. The
outer loop prints each rank. Notice that it indexes the array backward,
starting with 7 and going down to 0. That’s necessary so that the first rank
is printed at the bottom of the console output. An inner for loop is used to
print the squares for each rank. In this loop, an if statement checks the
value of the board array element that corresponds to the square to
determine whether it prints an X, a question mark, or a hyphen.

→167 The getYorN method simply displays a prompt on-screen and asks the
user to enter Y or N. It returns true if the user enters Y or false if the
user enters N. If the user enters anything else, this method prompts the
user again.

→183 The Pos class simply defines two public fields, x and y, to keep track of
board positions. It also defines

*/
