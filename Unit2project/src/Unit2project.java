public class Unit2project {
    //calls methods
    public static void main(String[] args) {
        //sets the height and width for methods
        int height = 6;
        int width = 6;
        stars(height, width, '#');
        stars(height, width, '*');
        stars(height, width, '$');


    }

    //prints box
    public static void stars(int height, int width, char character) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        System.out.println();
    }
}

