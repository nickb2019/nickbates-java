public class DrawBox {
    public static void main(String[] args){
        //draw box

        drawBox();
        drawBox();
        drawBox();
        System.out.println("Complete!");

    }

    public static void drawBox(){
        drawTopBottom();
        drawSides();
        drawTopBottom();



    }
    public static void drawTopBottom(){
        System.out.println("+-------+");
    }

    public static void drawSides(){
        System.out.println("|       |");
        System.out.println("|       |");
    }

}
