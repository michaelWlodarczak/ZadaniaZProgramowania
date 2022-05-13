package rozdzial3.iteracje;

public class ForLiczbyCalkowiteOd1Do20_3_4 {
    public static void main(String[] args) {
        int x;
        for (x = 1; x <= 20; x++) {
            if (x < 20) {
                System.out.print(x + ",");
            } else {
                System.out.println(x + ".");
            }
        }
    }
}
