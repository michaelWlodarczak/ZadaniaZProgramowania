package rozdzial5.zadanie_5_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Napisz program ktory rekurencyjnie oblicza kolejne wartosci n! dla n = 10
i wynik wyswietla na ekranie komputera
 */
public class StrongApp {
    public static void main(String[] args) throws IOException {

        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Strong s = new Strong();

        System.out.println("Computing the factorial for any integer");
        System.out.println("Insert n: ");
        n = Integer.parseInt(br.readLine());

//        for (int i = 1; i <= n; i++) {
//            System.out.println(i + "! = " + s.strong(i));
//        }
        System.out.println("Strong recursions: " + s.strongForLoop(n));

        System.out.println("Strong for loop: " + s.strongForLoop(n));

    }
}
