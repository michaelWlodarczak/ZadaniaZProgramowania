package tablice;
/*
Dane sa dwie macierze 10x10 'a' i 'b' , 'a' wyglada jak poniezej, a 'b' zawiera same 0. Program powoduje, ze 'b' wyglada jak ponizej
a: 0123456789  b: 0000000000
   0123...        1111111..
   012...         222...


 */

import java.util.Arrays;

public class Macierz_4_8 {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];

        //Wpisywanie liczb do macierzy 'a'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = j;
            }
        }
        //Wyswietlanie zawartosci macierzy 'a'
        System.out.println("Wstawianie liczb do macierzy 'a' odbywa sie przez warunek: a[i][j] = j" + "\n"
                + "Wyswietlanie zawartosci macierzy 'a': " + "\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        //Wstawianie '0' do macierzy 'b'
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = 0;
            }
        }
        //Wyswietlanie macierzy 'b'
        System.out.println();
        System.out.println("Wyswietlanie macierzy 'b': " + "\n");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        //przepisywanie liczb z macierzy 'a' do 'b'
        System.out.println();
        System.out.println("przepisywanie liczb z macierzy 'a' do 'b', "
                + "\nzmiane kolumn na wiersze zapisujemy nastepujaco: "
                + "\nb[i][j]=a[j][i]");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = a[j][i];  //zamiana kolumn na wiersze
            }
        }
        //Ponowne wypisanie macierzy 'b'
        System.out.println("Ponowne wyswietlanie macierzy 'b': " + "\n");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("A co gdyby zamiast zamieniac kolumny na wiersze uzupelnic macierz 'b' liczbami uzywajac ponizszego warunku: "
        +"\nb[i][j]=i ? ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j]=i;
            }
        }
        System.out.println("\nKolejne wyswietlanie macierzy 'b', ale moze to jest juz zupelnie inna macierz, a nie przepisana macierz 'a'?" + "\n");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
