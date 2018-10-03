public class rocketship {
    public static final int SIZE = 6;


    public static void main(String[] args) {
        cone();
        divider();
        topHalf();
        bottomHalf();
        divider();
        bottomHalf();
        topHalf();
        divider();
        cone();
    }

    public static void cone() {
        for (int row = 1; row <= (SIZE * 2 - 1) - row; row++) {
            System.out.print(" ");
            for (int space = 1; space >= (SIZE * 2 - 1) - row; space++) {
                System.out.print(" ");
            }
            for (int slash = 1; slash <= row; slash++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int slash = 1; slash <= row; slash++) {
                System.out.print("\\");
            }
            System.out.println(" ");

        }
    }
    public static void divider(){
        System.out.print("+");
        for(int i =1; i <= SIZE; i++){
            System.out.print("=*");
        }
        System.out.println("+");
    }
    public static void topHalf(){
        for(int line = 1; line <= (SIZE / 2); line++){
            System.out.print("|");
            for(int repeat = 1; repeat <= 2; repeat++){
                for(int dots = 1; dots <= (SIZE / 2) - line; dots++){
                    System.out.print(".");
                }
                for(int points = 1; points <= line; points++){
                    System.out.print("/\\");
                }
                for(int dots = 1; dots <= (SIZE / 2) - line; dots++){
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
    public static void bottomHalf(){
        for(int line = (SIZE / 2); line >= 1; line--){
            System.out.print("|");
            for(int repeat = 1; repeat <= 2; repeat++){
                for(int dots = 1; dots <= (SIZE / 2) - line; dots++){
                    System.out.print(".");
                }
                for(int points = 1; points <= line; points++){
                    System.out.print("\\/");
                }
                for(int dots = 1; dots <= (SIZE / 2) - line; dots++){
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }
}

