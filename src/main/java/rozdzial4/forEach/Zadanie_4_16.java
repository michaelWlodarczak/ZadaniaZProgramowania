package rozdzial4.forEach;

/*
Napisz program, ktory w tablicy jednowymairowej o nazwie 'dane'
umieszcza liczby od 1 do 100, a nastepnie  sumuje liczby parzyste i nieparzyste.
Skorzystaj z wlasciwosci petli for-each
 */

public class Zadanie_4_16 {
    public static void main(String[] args) {
        int n, i, sumaP, sumaNP;
        n = 100;
        sumaP = 0;
        sumaNP = 0;
        int[] dane = new int[n];  //deklaracja tablicy 'dane' typu int


        for (i = 0; i < dane.length; i++) {
            dane[i] = i + 1;
            System.out.println(dane[i]);
        }


        for (int x : dane) {
            if (x%2 == 0) {
                sumaP += x;
            }else {
                sumaNP+=x;
            }
        }
        System.out.println("\nSuma liczb parzystych od 1 do 100 = " + sumaP);
        System.out.println("\nSuma liczb nieparzystych od 1 do 100 = " + sumaNP);
    }
}
