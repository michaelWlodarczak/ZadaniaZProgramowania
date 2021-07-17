package tablice;

//Program w zadeklarowanej teblicy dwuwymiarowej 10x10 umieszcza w pierwszej kolumnie liczby od 0 - 9
//w drugiej kolumnie kwadraty tych liczb, natomiast w pozostalych 0.
//Dodatkowo program oblicza osobno sume liczb w pierwszej i drugiej kolumnie

public class Macierz_4_7 {
    public static void main(String[] args) {
        int n = 10, suma;
        int[][] macierz = new int[n][n];

        //wpisywanie liczb do macierzy
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (j==0) macierz[i][j]=i;
                if (j==1) macierz[i][j]=i*i;
                if (j>1) macierz[i][j]=0;
            }
        }
        //wyswietlanine wyniku na konsoli - wyswietlanie bez zmian jak
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;
        for (int i = 0; i < macierz.length; i++){
            suma += macierz[i][0]; //warunek sumowania elementow na przekatnej
        }
        System.out.println("Suma elementow w pierwszej kolumnie = " + suma);
        suma = 0;
        for (int i = 0; i < macierz.length; i++) {
            suma += macierz[i][1];
        }
        System.out.println("Suma elementow w drugiej kolumnie = " + suma);
    }
}