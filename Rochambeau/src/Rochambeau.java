import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Rochambeau {
    public static void main(String[] args) {
        char playStatus = 'y';
        Scanner console = new Scanner(System.in);


        playGame();


    }

    public static void playGame() {
        int rounds = 3;
        String playermove = " ";
        String computermove = " ";
        String Winner = " ";
        int playerChoice = 0;
        int playerScore = 0;
        int computerScore = 0;
        int num = (int) (Math.random() * (3 - 0) + 1);
        System.out.println("It is your turn!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose Rock, Paper, Scissors");
        String decision = scan.nextLine();
        System.out.println("Your Selection: " + decision);
        if (decision == "Rock") {
            playerChoice = 1;
        }if (decision == "Paper") {
            playerChoice = 2;
        }if (decision == "Scissors") {
            playerChoice = 3;
        }if (num == 1) {
            System.out.println("The computer chose Rock!");
            if ((num == 1 && playerChoice == 2) || (num == 2 && playerChoice == 3) || (num == 3 && playerChoice == 1)) {
                System.out.println("The player Wins!");
                playerScore += 1;
                System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                rounds += 1;
                playGame();

            }if ((num == 1 && playerChoice == 3) || (num == 2 && playerChoice == 1) || (num == 3 && playerChoice == 2)) {
                System.out.println("The Computer Wins!");
                computerScore += 1;
                System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                rounds += 1;
                playGame();
            }
            if (playerChoice == num) {
                System.out.println("It is a tie, go again!");
                playGame();
            }if ((computerScore == rounds || playerScore == rounds)) {
                System.out.println("The Game is over!");
            }if (num == 2) {
                System.out.println("The computer chose Paper!");
                if ((num == 1 && playerChoice == 2) || (num == 2 && playerChoice == 3) || (num == 3 && playerChoice == 1)) {
                    System.out.println("The player Wins!");
                    playerScore += 1;
                    System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                    rounds += 1;
                    playGame();

                }if ((num == 1 && playerChoice == 3) || (num == 2 && playerChoice == 1) || (num == 3 && playerChoice == 2)) {
                    System.out.println("The Computer Wins!");
                    computerScore += 1;
                    System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                    rounds += 1;
                    playGame();
                }if (playerChoice == num) {
                    System.out.println("It is a tie, go again!");
                    playGame();
                }
                if ((computerScore == rounds || playerScore == rounds)) {
                    System.out.println("The Game is over!");
                }
                if (num == 3) {
                    System.out.println("The computer chose Scissors!");
                    if ((num == 1 && playerChoice == 2) || (num == 2 && playerChoice == 3) || (num == 3 && playerChoice == 1)) {
                        System.out.println("The player Wins!");
                        playerScore += 1;
                        System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                        rounds += 1;
                        playGame();

                    }
                    if ((num == 1 && playerChoice == 3) || (num == 2 && playerChoice == 1) || (num == 3 && playerChoice == 2)) {
                        System.out.println("The Computer Wins!");
                        computerScore += 1;
                        System.out.println("Computer = " + computerScore + " Player = " + playerScore);
                        rounds += 1;
                        playGame();
                    }
                    if (playerChoice == num) {
                        System.out.println("It is a tie, go again!");
                        playGame();
                    }
                    if ((computerScore == rounds || playerScore == rounds)) {
                        System.out.println("The Game is over!");
                    }


                }


            }

        }
    }
}

