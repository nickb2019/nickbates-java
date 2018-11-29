import java.util.*;
public class fourpointone {
    public static void main(String[] args) {


       //exercise 1
        int[] name = new int[8];


        //exercise 2a

        int[] number = {12, 49, 6, 5, 3, 2, 1, 9};


        //2b
        int a = number[0];
        int b = number[1];
        int c = number[2];
        int d = number[3];
        int e = number[4];
        int f = number[5];
        int g = number[6];
        int h = number[7];

        //2c
        int[] array2 = {1, 2, 3, 4, 5};

        //2d
        int[] array3 = new int[4];
        for(int i = 0; i <array3.length;i++){
            array3[i] =i;
        }

        //2e
        int[] tooManyArrays = {-4, 19, 3, 20, 72, 58};


        //exercise 3a
        System.out.println(array3.length-3);


        //excercise 3b
        System.out.println(array3[3]);

        //3c
        for(int i = 0;i < array3.length;i++){
            array3[i] = i-1;
        }

        //3d
        int[] arrayEven = new int[499];
        for(int i = 0; i<500;i++){
            if(i%2 == 0){
                arrayEven[i] = i;
            }
        }
        System.out.println();



            }
        }


