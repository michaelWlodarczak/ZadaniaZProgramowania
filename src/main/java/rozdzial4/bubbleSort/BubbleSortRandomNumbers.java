package rozdzial4.bubbleSort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSortRandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int n;
        n = scanner.nextInt();
        int x, i, j;
        double[] numbers = new double[n];

        Random r = new Random();
        System.out.println("Losowe liczby w tablicy to: ");
        for (i = 0; i < n; i++) {
            numbers[i]=Math.round(100*(r.nextDouble()));
            if (i <= n-2) {
                System.out.print((int)numbers[i] + ", ");
            } else {
                System.out.print((int)numbers[i] + ".\n");
            }
        }
        //Algorytm sortowania babelkowego
        System.out.println("Algorytm sortowania babelowego\n");
        for (i = 1; i <= n-1; i++) {
            for (j = n-1; j >= i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    x = (int)numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = x;
                }
            } //j
        } //i

        System.out.println("Liczby uporzadkowane to: ");
        for (i = 0; i < n; i++) {
            if (i <= n-2) {
                System.out.print((int)numbers[i] + ", ");
            } else {
                System.out.print((int)numbers[i] + ".");
            }
        }
    }
}
