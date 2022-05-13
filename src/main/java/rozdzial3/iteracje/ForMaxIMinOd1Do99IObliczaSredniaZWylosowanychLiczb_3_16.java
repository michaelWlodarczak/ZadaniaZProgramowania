package rozdzial3.iteracje;

import java.util.Random;

//Program za pomoca 'for' znajduje max i min ze zbioru 'n' wylosowanych liczb
//z przdzialu od 0 do 99 (w zadaniau n = 5) oraz oblicza srednia
//ze wszystkich wylosowanych liczb
public class ForMaxIMinOd1Do99IObliczaSredniaZWylosowanychLiczb_3_16 {
    public static void main(String[] args) {
        System.out.println("Program za pomoca 'for' znajduje max i min ze zbioru 'n' wylosowanych liczb " +
                "\nz przdzialu od 0 do 99 (w zadaniau n = 5) oraz oblicza srednia " +
                "\nze wszystkich wylosowanych liczb");

        Random r = new Random();

        int n = 5;
        double liczba = 0;
        double suma = 0;
        double min;
        double max;

        min = Math.round(100 * (r.nextDouble()));
        max = min;
        suma += max;


        //TODO - Przyjzec sie temu, czy na pewno dziala poprawnie, bo cos mi tu nie gra... ;/
        for (int i = 0; i < n; i++) {
            liczba = Math.round(100 * (r.nextDouble()));
            System.out.print(liczba + ", ");
            if (liczba > max) max = liczba;
            if (liczba < min) min = liczba;
            suma += liczba;
        }
        System.out.println("\n" +"Max = " + max + "\nMin = " + min + "\nSuma = " + suma + "\nSrednia = " + suma / n);
    }
}

