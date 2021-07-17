package iteracje;

import java.util.Random;

public class WhileMaxIMinOd1Do99IObliczaSredniaZWylosowanychLiczb_3_18 {
    public static void main(String[] args) {
        System.out.println("Program za pomoca 'while' znajduje max i min ze zbioru 'n' wylosowanych liczb " +
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

        while (i <= n) {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.println(liczba + ", ");
            if (liczba > max) max = liczba;
            if (liczba < min) min = liczba;
            suma += liczba;
            i++;
        }

        System.out.println("Max = " + max + "\nMin = " + min + "\nSuma = " + suma + "\nSrednia = " + suma / n);
    }
}

