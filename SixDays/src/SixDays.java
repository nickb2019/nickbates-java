import java.sql.SQLOutput;
public class SixDays {
    /*
    ********************************
    * Nicholas Bates
    * Ap CS A
    * Period 1
    * September 12, 2018
    * Project #1 - SixDays of Xmas
    * ******************************
     */
    //prints song
    public static void main(String[] args){
        Day1();
        Day2();
        Day3();
        Day4();
        Day5();
        Day6();
    }
    //Day 1 method
    public static void Day1(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent me");
        Partridge();
    }
    //partridge method
    public static void Partridge(){
        System.out.println("a partridge in a pear tree\n");
    }
    //Day 2 method
    public static void Day2(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        Turtle();
    }
    //turtle method
    public static void Turtle(){
        System.out.println("two turtle doves, and");
        Partridge();
    }
    //Day 3 method
    public static void Day3(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent me");
        FrechHen();
    }
    //French hens method
    public static void FrechHen(){
        System.out.println("three French hens,");
        Turtle();
    }
    //Day 4 method
    public static void Day4(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent me");
        Birds();
    }
    //Birds method
    public static void Birds(){
        System.out.println("four calling birds,");
        FrechHen();
    }
    //Day 5 method
    public static void Day5(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent me");
        GoldenRings();
    }
    //Golden Rings method
    public static void GoldenRings(){
        System.out.println("five golden rings,");
        FrechHen();
    }
    //Day 6 method
    public static void Day6(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent me");
        Sixgeese();
    }
    //Sixgeese method
    public static void Sixgeese(){
        System.out.println("six geese a-laying,");
        GoldenRings();
    }
}
