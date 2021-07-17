package iteracje;

public class WhileLiczbyCalkowiteOd1Do20_3_6 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Program wyswietla liczby od 1 do 20");
        while (x <= 20) {
            if (x < 20)
                System.out.print(x + ",");
             else
                System.out.print(x + ".");
                x++;
            }
        }
    }

