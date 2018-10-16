/*
 *****************************************************
 * Nicholas Bates
 * AP CS A
 * Period 1
 * October 9, 2018
 * DrawRocket assignment; prints rocket to console
 *****************************************************
 */
public class DrawRocket {
   //sets the sie of the rocket
    public static final int SIZE = 50;
//calls the diffrent parts of the rocket
    public static void main(String[] args) {
        drawCone();
        drawDivider();
        drawTopHalf();
        drawBottomHalf();
        drawDivider();
        drawBottomHalf();
        drawTopHalf();
        drawDivider();
        drawCone();


    }

//draws the cone of the rocket
    public static void drawCone() {
        for (int line = 1; line <= (SIZE * 2 - 1); line++) {
            System.out.print(" ");
            for (int space = 1; space <= (SIZE * 2 - 1) - line; space++){
                System.out.print(" ");
            }
            for (int slash = 1; slash <= line; slash++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slashes = 1; slashes <= line; slashes++) {
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }
//draws the divider of the rocket
    public static void drawDivider() {
        System.out.print("+");
        for (int i = 1; i <= SIZE * 2; i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }
//draws the top half of the rocket
    public static void drawTopHalf() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
                for (int points = 1; points <= line; points++) {
                    System.out.print("/\\");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
//draws the bottom half of the rocket
    public static void drawBottomHalf() {
        for (int line = SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int repeat = 1; repeat <= 2; repeat++) {
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
                for (int points = 1; points <= line; points++) {
                    System.out.print("\\/");
                }
                for (int dots = 1; dots <= SIZE - line; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
}


