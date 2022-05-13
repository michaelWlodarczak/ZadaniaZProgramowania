package rozdzial3.iteracje;

public class ForYRownaSie3X_3_1 {
    public static void main(String[] args) {
        int x, y;
        for (x=0;x<=10;x++){
            y = 3*x;
            System.out.println("Dla x = " + x + '\t' + "y = " + y);
            // '\t' oznacza przejscie do nastepnej pozycji w tabulacji linii
        }
    }
}
