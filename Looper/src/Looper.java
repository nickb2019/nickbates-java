/*
 *****************************************************
 * Name: Nicholas Bates
 * AP CS A
 * Period 1
 * Date:
 * Frac Calc
 *****************************************************
 */
import java.sql.SQLOutput;
import java.util.Scanner;

public class Looper {

    /*
     * Don't forget to comment!
     */
    public static void main(String[] args) {
       String input1 = " ";
       while(true){
           System.out.println("Enter Something: ");
           Scanner scan = new Scanner(System.in);
           input1 = scan.next();
           if(input1.equals("quit")){
               break;
           }
           String input2 = scan.next();
           String input3 = scan.next();
           System.out.println(input1);
           System.out.println(input2);
           System.out.println(input3);
       }
        System.out.println("Program ended");

    }

    public static String add(final int firstNume, final int firstDenom,
                             final int secondNume, final int secondDenom) {
        return "";
    }

    public static String subtract(final int firstNume, final int firstDenom,
                                  final int secondNume, final int secondDenom) {
        return "";
    }

    public static String multiply(final int firstNume, final int firstDenom,
                                  final int secondNume, final int secondDenom) {
        return "";
    }

    public static String divide(final int firstNume, final int firstDenom,
                                final int secondNume, final int secondDenom) {
        return "";
    }

    public static int parseWhole(final String fraction) {
        return 0;
    }

    public static int parseNume(final String fraction) {
        return 0;
    }

    public static int parseDenom(final String fraction) {
        return 0;
    }
}
