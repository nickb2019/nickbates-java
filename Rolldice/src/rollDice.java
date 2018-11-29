import java.util.Scanner;
public class rollDice {
    public static final int DICENUM = 1;
    public static void main(String[] args) {
        String play = " ";
        System.out.println("Do you want to play y/n?");
        Scanner playGame = new Scanner(System.in);
        play = playGame.nextLine();
        defDice();
        while(play.equals("y")) {
            printDice();
            rollDice();
            drawLine();
            System.out.println("Do you want to play Again y/n?");
            play = playGame.nextLine();
        }
    }
    public static void defDice(){
        System.out.println("Im at defDice");
    }
    public static void printDice(){
        System.out.println("Im at print Dice");
    }
    public static void rollDice(){
        System.out.println("Im at roll Dice");
    }
    public static void drawLine(){
        System.out.println("Im at draw line");
    }

}
