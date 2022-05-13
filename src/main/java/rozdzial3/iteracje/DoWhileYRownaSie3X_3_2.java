package rozdzial3.iteracje;

public class DoWhileYRownaSie3X_3_2 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println("Program oblicza wartosc funkcji y=3*x \ndla x zmieniajacego sie od 0 do 9");
        do {
            y = 3 * x;
            System.out.println("Dla x = " + x + '\t' + "y = " + y);
            x++;
        } while (x <= 10);
    }
}
