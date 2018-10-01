public class Unit2project {
    public static final int ROW = 6;
    public static final int COLUMN = 4;

    public static void main(String[] args) {
        stars();
        money();
        Hashtag();

    }

    public static void stars() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println();
    }

    public static void money() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print("$");


            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Hashtag() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                System.out.print("#");


            }
            System.out.println();
        }
        System.out.println();
    }
}
