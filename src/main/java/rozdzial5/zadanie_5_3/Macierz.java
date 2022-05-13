package rozdzial5.zadanie_5_3;

import java.util.Random;

public class Macierz {

    public void czytajDane(double[][] macierz, int size) {
        Random r = new Random();
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j)
                    macierz[i][j] = Math.round(9 * (r.nextDouble()));
                else
                    macierz[i][j] = 0;

            }
        }
    }

    public void przetworzDane(double[][] macierz, int size) {
        double sum = 0;
        for (int i = 0; i < macierz.length; i++) {
            sum += macierz[i][i];
        }
        System.out.println("Suma elementow na przekatnej wynosi: " + sum);
    }

    public void wyswietlWynik(double[][] macierz,int size){
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print((int) macierz[i][j]+" ");
            }
            System.out.println();
        }
    }

}
