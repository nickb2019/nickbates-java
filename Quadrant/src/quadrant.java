public class quadrant {
    public static void main(String[] args) {
        System.out.println(quadrant(4,-6));
    }

    public static String quadrant(double x, double y) {
        if(x == 0) {
            return("0");
        }
        if(y == 0){
            return("0");
        }
        if (x > 0) {
            if (y > 0) {
                return("It is in Quadrant I");
            } if(y < 0) {
                return("It is in Quadrant IV");
            }
        } else {
            if (x < 0) {
                if (y < 0) {
                    return("It is in Quadrant III");
                } else {
                    return("It is in Quandrant II");
                }
            }
        }
    return("0");}
}
