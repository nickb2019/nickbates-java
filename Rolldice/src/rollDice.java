//Nicholas Bates
//12/7/18
//Ap CS A
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class rollDice {
    public static final int DICENUM = 3;
    public static void main(String[] args) {
        //asks user if they want to play
        String play = " ";
        System.out.println("Do you want to roll a dice? y/n?");
        Scanner playGame = new Scanner(System.in);
        play = playGame.nextLine();
        String dice[][] = new String[6][5];
        String gameDice[][] = new String[DICENUM][5];
        dice = defDice();
        while(play.equals("y")) {
            //makes it roll to the class constant
            for(int i=0;i<DICENUM;i++) {
                int x = rollDice();
                printDice(dice, x);
                drawLine();
            }
            //asks user if they want to continue
            System.out.println("Do you want to Roll Again y/n?");
            play = playGame.nextLine();

        }
    }

   //defines the 6 sided dice
    public static String[][] defDice() {
         return new String [][]{
                {" ------- ",
                        "|       |",
                        "|   *   |",
                        "|       |",
                        " ------- "},
                 {" ------- ",
                        "|       |",
                        "|  * *  |",
                        "|       |",
                        " ------- "},
                {" ------- ",
                        "|*      |",
                        "|   *   |",
                        "|      *|",
                        " ------- "},
                {" ------- ",
                        "| *   * |",
                        "|       |",
                        "| *   * |",
                        " ------- "},
                {" ------- ",
                        "| *   * |",
                        "|   *   |",
                        "| *   * |",
                        " ------- "},
                {" ------- ",
                        "| *   * |",
                        "| *   * |",
                        "| *   * |",
                        " ------- "}

        };

    }
    //prints dice
    public static void printDice(String[][] dice, int x){


           for (int i = 0; i < 4; i++) {
               System.out.println(dice[x][i]);
           }

       }


    //rolls the dice
       public static int rollDice() {

        int x = (int)(Math.random()*5)+1;

            return x;
    }
//creates a line
    public static void drawLine(){

        System.out.println("---------------------------");
    }

}
