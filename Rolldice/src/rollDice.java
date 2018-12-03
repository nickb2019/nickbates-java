import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class rollDice {
    public static final int DICENUM = 1;
    public static void main(String[] args) {
        String play = " ";
        System.out.println("Do you want to play y/n?");
        Scanner playGame = new Scanner(System.in);
        play = playGame.nextLine();
        String dice[][] = new String[6][5];
        String gameDice[][] = new String[DICENUM][5];
        dice = defDice();

        while(play.equals("y")) {
            printDice();
            rollDice();
            drawLine();
            System.out.println("Do you want to play Again y/n?");
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
                        "|*     *|",
                        "|       |",
                        "|*     *|",
                        " ------- "},
                {" ------- ",
                        "|*     *|",
                        "|   *   |",
                        "|*     *|",
                        " ------- "},
                {" ------- ",
                        "| *   * |",
                        "| *   * |",
                        "| *   * |",
                        " ------- "}

        };

    }
    public static void printDice(Arrays dice){

        System.out.println("Im at print Dice");
        for(int i = 0; i <6;i++){
            for(int j = 0; j<5;j++){
                System.out.println(dice[i][j]);
            }
        }
    }

    public static void rollDice() {
        System.out.println("Im at roll Dice");
    }

    public static void drawLine(){

        System.out.println("Im at draw line");
    }

}
