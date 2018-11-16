public class MinMax {
    public static void main(String[] args) {
        System.out.println(min(3, 4, 5));
        System.out.println(oof(3,4,5));
    }
    public static int min(int a, int b, int c){

        return(Math.min(Math.min(a,b),c));
    }



    public static double oof(int a, int b, int c){
        double value = (Math.sqrt(Math.min(Math.min(a,b),c) + Math.max(Math.max(a,b),c)));
        return value;
    }
}
