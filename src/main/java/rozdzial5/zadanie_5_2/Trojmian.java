package rozdzial5.zadanie_5_2;

import java.util.Scanner;

public class Trojmian {

    double a, b, c, delta, x1, x2;
    char liczbaPierwiastkow;

    public void czytajDane() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program oblicza pierwiastki rownania kwadratowego \nax^2 + bx + c = 0");
        System.out.println("Podaj wspolczynnik 'a': ");
        a = sc.nextDouble();
        if (a == 0) {
            System.out.println("Nieprawidłowa wartosc wspolczynnika a");
            System.exit(-1);
        } else {
            System.out.println("Podaj wspolczynnik 'b': ");
            b = sc.nextDouble();
            System.out.println("Podaj wspolczynnik 'c': ");
            c = sc.nextDouble();
        }
    }

    public void przetworzDane() {
        delta = b * b - 4 * a * c;
        if (delta < 0) liczbaPierwiastkow = 0;
        if (delta == 0) liczbaPierwiastkow = 1;
        if (delta > 0) liczbaPierwiastkow = 2;
        switch (liczbaPierwiastkow) {
            case 1:
                x1 = -b / (2 * a);
                break;
            case 2:
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                break;
        }
    }

    public void wyswietlDane() {
        System.out.println("Dla wprowadzonych liczb: ");
        System.out.printf("a = " + "%2.2f,", a);
        System.out.printf(" b = " + "%2.2f,", b);
        System.out.printf(" c = " + "%2.2f,", c);
        switch (liczbaPierwiastkow) {
            case 0:
                System.out.println(" brak pierwiastkow rzeczywistych.");
                break;
            case 1:
                System.out.println(" trojmian ma jedno rozwiazanie podwojne x1 = ");
                System.out.printf("%2.2f",x1);
                break;
            case 2:
                System.out.println(" trojmian ma dwa rozwiazania:");
                System.out.printf(" x1 = " + "%2.2f,",x1);
                System.out.printf(" x2 = " + "%2.2f",x2);
                break;
        }
    }

}
