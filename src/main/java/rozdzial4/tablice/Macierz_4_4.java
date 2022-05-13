package rozdzial4.tablice;

//Program w tablicy 10 x 10 (macierz) umieszcza na przekątnej liczby 0-9, a poza przekatna - 0,
//Dodatkowo program oblicza sume elementow wyroznionych w tablicy tj. tych na przekatnej

public class Macierz_4_4 {
    public static void main(String[] args) {
        int n = 10, suma;
        int[][] macierz = new int[n][n];
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz.length; j++) {
                if (i == j) {
                    macierz[i][j] = i;
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
            suma += macierz[i][i]; //suma = macierz[i][i] + suma;
        }
        System.out.print("Suma elementow wyroznionych w macierzy = " + suma);
    }
}


