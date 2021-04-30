package tablice;

//Napisz program ktory w 10-elementowej tablicy jednowymiarowej o nazwie "dane"
//umieszcza liczby od 0 - 9

public class Dane_4_1 {
    public static void main(String[] args) {
        int n = 10;
        int[] dane = new int[n];

        for (int i = 0; i < dane.length; i++) {
            dane[i] = i;
            System.out.println("dane[" + i+ "]" + " = " + dane[i]);
        }
    }
}
