package rozdzial1.prosteOperacjeWejsciaWyjscia;

import java.util.Scanner;

public class SimpleAdditionSubtractionMultiplicationDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dwie liczby 'x' i 'y': ");
        System.out.println("x = ");
        float x = input.nextFloat();
        System.out.println("y = ");
        float y = input.nextFloat();
        float add = x + y;
        float sub = x - y;
        float mul = x * y;
        float div = x / y;
       /* System.out.println("Suma = " + "%2.2f, \n", + add);
        System.out.println("Roznica = " + "%2.2f, \n", + sub);
        System.out.println("Iloczyn = " + "%2.2f, \n", + mul);
        System.out.println("Iloraz = " + "%2.2f, \n", + div);*/

    }
}