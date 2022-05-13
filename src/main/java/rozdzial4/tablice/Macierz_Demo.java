package rozdzial4.tablice;

//Program w tablicy 10 x 10 (macierz) umieszcza na przekątnej liczbe 1 (liczby 0-9), a poza przekatna - 0,
//Dodatkowo program oblicza sume elementow wyroznionych w tablicy tj. tych na przekatnej
//odwracanie macierzy

public class Macierz_Demo {
    public static void main(String[] args) {
        int n = 10, suma;
        int[][] macierz = new int[n][n];
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (n == i+j+1) { // najwazniejszy warunek odwrocenia macierzy
                    macierz[i][j] = i; // macierz[j][i] = i; to na przekatnej beda liczby od 0 - 9
                } else {
                    macierz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                System.out.print(macierz[i][j] + "");
            }
            System.out.println();
        }
        suma = 0;
        for (int i = 0; i < macierz.length; i++){
            suma += macierz[i][n-i-1];  //warunek aby sumowac elementy na przekatnej
        }
        System.out.print("Suma elementow wyroznionych w macierzy = " + suma);
    }
}


