import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Rochambeau {
    public static void main(String[] args) {
        char playStatus = 'y';
        Scanner console = new Scanner(System.in);

        while (playStatus == 'y') {

            System.out.println("Hello! welcome to Rock, Paper, Scissors!\nIt is your turn!");

            playGame();

        }

    }

    public static void playGame() {
        String playermove = " ";
        String computermove = " ";
        String Winner = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Rock, Paper, Scissors");
        String decision = scan.nextLine();
        System.out.println("Your Selection: " + decision);
        computerdecision();


    }

    //1 equals rock, 2 equals papr, 3 equals scissors
    public static void computerdecision() {
        int num = (int) (Math.random() * (3 - 0) + 1);
        if(num == 1){
            System.out.println("The computeer chose Rock!");
        }if(num == 2){
            System.out.println("The computer chose Paper!");
        }if(num == 3){
            System.out.println("The computer chose Scissors!");
        }
    }


}

