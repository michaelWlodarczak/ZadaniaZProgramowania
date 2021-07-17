package tablice;

/*
Dane sa 3 macierze 10x10, 'a','b' i 'c'.
W Macierzy 'a' sa same jedynki (1)
W Macierzy 'b' sa same 2-ki
Wartosci w macierzy 'c' maja byc suma macirzy 'a' i 'b', czyli same trojki (3)
 */
public class Macierz_4_9 {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        //Wpisywanie wartosci do macierzy 'a' i 'b'
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 1;
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = 2;
            }
        }
        System.out.println("Macierz 'a': " + "\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nMacierzy 'b: " + "\n");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("\nMacierz 'c': " + "\n");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nFragment kodu odpowiedzialny za dodawanie macierzy: "
                + "\nc[i][j] = a[i][j]+b[i][j]");
    }
}
