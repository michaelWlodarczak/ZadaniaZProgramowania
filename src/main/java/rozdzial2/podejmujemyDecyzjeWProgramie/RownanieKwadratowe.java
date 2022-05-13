package rozdzial2.podejmujemyDecyzjeWProgramie;

import java.util.Scanner;

/* delta = b^2 - 4ac
 x1 = (-b - sqrl delta)/2a
 x2 = (-b + sqrl delta)/2a
  */

public class RownanieKwadratowe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program oblicza pierwiastki rownania kwadratowego \nax^2 + bx + c = 0");
        System.out.println("Podaj wspolczynnik a: ");
        double a = input.nextDouble();
        if (a == 0){
            System.out.println("Niedozwolona wartosc wspolczynnika a");
        }else {
            System.out.println("Podaj wspolczynnik b: ");
            double b = input.nextDouble();
            System.out.println("Podaj wspolczynnik c: ");
            double c = input.nextDouble();

            double delta = b*b-4*a*c;
            if (delta < 0) {
                System.out.println("Brak rozwiazania (Brak pierwiastkow rzeczywistych)");
            }else if (delta == 0){
                double x;
                x = -b/(2*a);
                System.out.println("Jedno podwojne rozwiazanie x = " + x);
            }else {
                double x1 = (-b - Math.sqrt(delta))/(2*a);
                double x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.println("Dla podanych wspolczynnkow a = " + a + " b = " + b + " c = " + c +  "\nrownanie ma dwa rozwiazania x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
