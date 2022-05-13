package rozdzial5.zadanie_5_6;

/*
Program ktory rekurencyjnie znajduje 10 pierwszych liczb trojkatnych
i wyswietla je na ekranie komputera.

W matematyce liczba trojkatne to taka, ktora mozna zapisac w postaci
sumy kolejnych poczatkowych liczb naturalnych: T = 1 + 2 + 3 + ... + (n-1) + n.
Liczby nalerzace do tego ciagu sa trojkatnymi, gdyz mozna je przedstawic w formie trojkata.
Np. #6 = 21.
 */
public class LiczbyTrojkatneApp {
    public static void main(String[] args) {

        int n = 10;

        System.out.println("Program znajduje 10 pierwszych liczb trojkatnych.");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "# = " + LiczbyTrojkatne.triangle(i));
        }
    }
}
