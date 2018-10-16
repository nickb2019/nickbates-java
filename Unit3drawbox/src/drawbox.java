public class drawbox {
    public static void main(String[] args){
        int height = 3;
        int width = 3;
        draw(height, width);
    }
    public static void draw(int height, int width){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
