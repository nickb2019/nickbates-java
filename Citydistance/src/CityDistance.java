/*
Nicholas Bates
10/18/18
Ap Computer Science
period 1
 */

public class CityDistance {
    public static void main(String[] args) {

       //first exercise Tacoma to Gig Harbor
        System.out.println(distance(16, 10, 4, 28) + " miles from Tacoma to Gig Harbor!");

        //second exercise Tacoma to Gig Harbor to Steilacoom
        System.out.println(distance(16,10,4,28) + distance(4,28,2,8) + " miles from Tacoma to Gig Harbor to Steilacoom!");

        //third exercise Tacoma to Gig Harbor to Steilacoom to Tacoma
        System.out.println(distance(16,10,4,28) + distance(4,28,2,8) + distance(2,8,16,10) + " miles round trip from Tacoma to Gig Harbor to Steilacoom!");

    }
        //CALCULATES DISTANCE BETWEEN CITIES
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }
}

