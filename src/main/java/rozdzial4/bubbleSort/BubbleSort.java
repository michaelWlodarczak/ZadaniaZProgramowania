package bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int x, i, j;
        int[] liczby = new int[6];

        liczby[0] = 743;
        liczby[1] = 944;
        liczby[2] = 4;
        liczby[3] = 11;
        liczby[4] = 623;
        liczby[5] = 91;

        System.out.println("Dla liczb: ");  //iteracja po tablicy
        for (i = 0; i < 6; i++) {
            if (i <= 4) {
                System.out.print(liczby[i] + ", ");
            } else {
                System.out.print(liczby[i] + ".\n");
            }
        }
        //Algorytm sortowania babelkowego
        System.out.println("Algorytm sortowania babelowego\n");
        for (i = 1; i <= 5; i++) {
            for (j = 5; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            } //j
        } //i

        System.out.println("Liczby uporzadkowane to: ");
        for (i = 0; i < 6; i++) {
            if (i <= 4) {
                System.out.print(liczby[i] + ", ");
            } else {
                System.out.print(liczby[i] + ".");
            }
        }
    }
}
