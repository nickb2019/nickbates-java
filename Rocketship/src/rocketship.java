public class rocketship {
    public static void main(String[] args) {
        cone();
    }

    public static void cone() {
        for (int row = 0; row < 5; row++) {
            for (int space = 7; space > row; space--)
                System.out.print(' ');
            for (int slash = 0; slash <= row; slash++)
                System.out.print('/');
            System.out.print("**");
            for (int slash = 0; slash <= row; slash++)
                System.out.print('\\');
            System.out.println();

        }
    }
}
