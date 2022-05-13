package rozdzial4.tablice;

//Napisz program ktory w 10-elementowej tablicy jednowymiarowej o nazwie "dane"
//umieszcza liczby od 9 - 0

public class Dane_4_2 {
    public static void main(String[] args) {
       // int n = 10;
        int[] dane = new int[10]; //int[] dane = new int[n];
        for (int i = 0; i < dane.length; i++) {
            dane[i] = 10 - 1 - i;
            System.out.println("dane[" + i+ "]" + " = " + dane[i]);
        }
    }
}

