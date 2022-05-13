package rozdzial5.zadanie_5_3;

/*
Program umieszcza w tablicy 10x10 losowe liczby z przedzialu 0-9 na przekatnej.
Poza przekatna sa same '0'.
Dodatkowo metoda przetworzDane oblicza i wyswietla sume liczb na przekatnej
 */

public class MacierzMain {
    public static void main(String[] args) {
        int size = 10;
        double[][] martix = new double[size][size];

        Macierz macierz = new Macierz();
        macierz.czytajDane(martix,size);
        macierz.przetworzDane(martix,size);
        macierz.wyswietlWynik(martix,size);
    }
}
