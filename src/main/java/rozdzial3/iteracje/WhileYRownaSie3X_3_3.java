package iteracje;

public class WhileYRownaSie3X_3_3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x <= 10) {
            y = 3*x;
            x++;
            System.out.println("Dla x = " + x + '\t' + "y = " + y);
        }
    }
}
