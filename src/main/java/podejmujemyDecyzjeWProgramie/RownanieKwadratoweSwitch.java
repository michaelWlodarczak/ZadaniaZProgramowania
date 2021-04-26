package podejmujemyDecyzjeWProgramie;

import java.util.Scanner;

public class RownanieKwadratoweSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program oblicza pierwiastki rownania kwadratowego \nax^2 + bx + c = 0");
        System.out.println("Podaj wspolczynnik a: ");
        double a = input.nextDouble();
        char liczba_pierwiastkow = 0;
        double x1, x2;
        if (a == 0) {
            System.out.println("Niedozwolona wartosc wspolczynnika a");
        } else {
            System.out.println("Podaj wspolczynnik b ");
            double b = input.nextDouble();
            System.out.println("Podaj wspolczynnik c ");
            double c = input.nextDouble();
            double delta = b * b - 4 * a * c;
            if (delta < 0) liczba_pierwiastkow = 0;
            if (delta == 0) liczba_pierwiastkow = 1;
            if (delta > 0) liczba_pierwiastkow = 2;
            switch (liczba_pierwiastkow) {
                case 0:
                    System.out.println("liczba pierwiastkow wynosi 0");
                    break;
                case 1:
                    x1 = -b / (2 * a);
                    System.out.println("Dla a = " + a + " b = " + b + " c = " + c + "\n trojmian ma jedno rozwiazanie podwojne x1 = " + x1);
                    break;
                case 2:
                    x1 = (-b - Math.sqrt(delta)) / (2 * a);
                    x2 = (-b + Math.sqrt(delta)) / (2 * a);
                    System.out.println("Dla a = " + a + " b = " + b + " c = " + c + "\n trojmian ma dwa rozwiazania x1 = " + x1 + "\n x2 = " + x2);
                    break;
            }
        }
    }
}