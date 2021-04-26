package iteracje;

import java.util.Random;

public class DoWhileMaxIMinOd1Do99IObliczaSredniaZWylosowanychLiczb_3_17 {
    public static void main(String[] args) {
        System.out.println("Program za pomoca 'do while' znajduje max i min ze zbioru 'n' wylosowanych liczb " +
                "\nz przdzialu od 0 do 99 (w zadaniau n = 5) oraz oblicza srednia " +
                "\nze wszystkich wylosowanych liczb");

        Random r = new Random();

        int n = 5;
        int i = 1;
        double liczba = 0;
        double suma = 0;
        double min;
        double max;

        min = Math.round(100 * (r.nextDouble()));
        max = min;
        suma += max;

        do {
            liczba = Math.round(100*(r.nextDouble()));
            System.out.print(liczba + ", " );
            if (liczba > max) max = liczba;
            if (liczba < min) min = liczba;
            suma += liczba;
            i++;

        }while (i <= n);
            System.out.println("\nMax = " + max + "\nMin = " + min + "\nSuma = " + suma + "\nSrednia = " + suma / n);
    }
}

