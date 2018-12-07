import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class rollDice {
    public static final int DICENUM = 3;
    public static void main(String[] args) {
        String play = " ";
        System.out.println("Do you want to roll a dice? y/n?");
        Scanner playGame = new Scanner(System.in);
        play = playGame.nextLine();
        String dice[][] = new String[6][5];
        String gameDice[][] = new String[DICENUM][5];
        dice = defDice();
        while(play.equals("y")) {
            for(int i=0;i<DICENUM;i++) {
                int x = rollDice();
                printDice(dice, x);
                drawLine();
            }
            System.out.println("Do you want to Roll Again y/n?");
            play = playGame.nextLine();

        }
    }

    public static String[][] defDice() {
        System.out.println("Im at defDice");
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
    public static void printDice(String[][] dice, int x){


           for (int i = 0; i < 4; i++) {
               System.out.println(dice[x][i]);
           }

       }


    public static int rollDice() {

        int x = (int)(Math.random()*5)+1;

            return x;
    }

    public static void drawLine(){

        System.out.println("---------------------------");
    }

}
