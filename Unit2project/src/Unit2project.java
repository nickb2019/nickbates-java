public class Unit2project {
//cals methods
    public static void main(String[] args) {
       //sets the height and width for methods
        int height = 9;
       int width = 12;
       stars(height, width);
        money(height, width);
        Hashtag(height, width);

    }
//prints star box
    public static void stars(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            System.out.println();
    }
// prints money box
    public static void money(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("$");


            }
            System.out.println();
        }
        System.out.println();
    }
// prints hashtag box
    public static void Hashtag(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");


            }
            System.out.println();
        }
        System.out.println();
    }
}
