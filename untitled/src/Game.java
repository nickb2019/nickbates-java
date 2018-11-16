import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay = ""; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine
        //computer's play
        String response;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
                "Please enter a move.\n" + "Rock = R, Paper" +
                "= P, and Scissors = S.");

        System.out.println();


        computerInt = (int) (Math.random() * (3 - 0) + 1);

        //Translate computer's randomly generated play to
        //string using if //statements

        if (computerInt == 1)
            computerPlay = "R";
        else if (computerInt == 2)
            computerPlay = "P";
        else if (computerInt == 3)
            computerPlay = "S";


        //Get player's play from input-- note that this is
        // stored as a string
        System.out.println("Enter your play: ");
        personPlay = scan.next();

        //Make player's anwser become uppercase
        personPlay = personPlay.toUpperCase();

        //Print computer's play
        System.out.println("Computer play is: " + computerPlay);


        //Determine Winner

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
            else if (personPlay.equals("P"))
                if (computerPlay.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (computerPlay.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
                else if (personPlay.equals("S"))
                    if (computerPlay.equals("P"))
                        System.out.println("Scissor cuts paper. You win!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Rock breaks scissors. You lose!!");
                    else
                        System.out.println("Invalid user input.");
    }
}
