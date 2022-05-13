package rozdzial3.iteracje;

public class DoWhileLiczbyCalkowiteOd1Do20_3_5 {
    public static void main(String[] args) {
    int x = 1;
        System.out.println("Program wypisuje liczby od 1 do 20");
        do {
            if (x <=20)
                System.out.print(x + ",");
            else
                System.out.print(x + ".");
            x++;
        }
        while (x <=20);
    }
}