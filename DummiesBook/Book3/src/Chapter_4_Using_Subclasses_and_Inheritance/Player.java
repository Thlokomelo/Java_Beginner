/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter_4_Using_Subclasses_and_Inheritance;

/*
Page: 292
Polymorphism
 */
class Player {

    public int move() {                     //superclass method
        for (int i = 0; i < 9; i++) {
            System.out.println(
                    "\nThe basic player says:");
            System.out.println(
                    "I'll take the first open square!");
            return firstOpenSquare();
        }
        return -1;
    }

    private int firstOpenSquare() {
        int square = 0;
// code to find the first open square goes here
        return square;
    }

    class BetterPlayer extends Player {                     //subclass

        @Override
        public int move() {                                 //overrides superclass method above
            System.out.println("\nThe better player says:");
            System.out.println(
                    "I'm looking for a good move...");
            return findBestMove();
        }

        private int findBestMove() {
            int square = 0;
// code to find the best move goes here
            return square;
        }
    }
}

