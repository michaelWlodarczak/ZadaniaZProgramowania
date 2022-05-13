package rozdzial4.forEach;

/*
Napisz program, ktory w tablicy jednowymairowej o nazwie 'dane'
umieszcza liczby od 1 do 100, a nastepnie je sumuje.
Skorzystaj z wlasciwosci petli for-each
 */

import java.util.Arrays;

public class Zadanie_4_15 {
    public static void main(String[] args) {
        int n, i, suma;
        n = 100;
        suma = 0;
        int[] dane = new int[n];  //deklaracja tablicy 'dane' typu int


//        for (i = 0; i < dane.length; i++) {
//            dane[i] = i + 1;
//            System.out.println(dane[i]);
//        }
        for (i = 0; i < dane.length; i++) {
            dane[i]=i+1;
            if (i <= dane.length-2){
                System.out.print(dane[i] + ", ");
            }else {
                System.out.print(dane[i] + ".\n");
            }
        }

        for (int x : dane) {
            suma += x;
        }
        System.out.println("\nSuma liczb od 1 do 100 = " + suma);
    }

}
