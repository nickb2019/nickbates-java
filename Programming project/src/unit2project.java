public class Programmingproject{
    public static final int ROW = 2;
    public static final int COLUMN = 8;

    public static void main(String[] args){
    stars();

    }
    public static void stars(){
        for(int i=0; i<=ROW; i++){
            for(int j=0; j<=COLUMN; j++){
                System.out.println("*");
            }
        }

    }
}
