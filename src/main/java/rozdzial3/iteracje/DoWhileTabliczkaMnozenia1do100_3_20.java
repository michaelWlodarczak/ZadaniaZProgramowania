package rozdzial3.iteracje;

public class DoWhileTabliczkaMnozenia1do100_3_20 {
    public static void main(String[] args) {
        System.out.println("Program wyswietlajacy tabliczke mnozenia dla liczb z przedzialu od 1 do 100 z wykorzystaniem podwojnej petli do...while");
        int size = 10;
        int wiersze;
        int kolumny;
        wiersze = 1;
        do {
            kolumny = 1;
            do {
                System.out.println(wiersze * kolumny + "\t");
                kolumny++;
            } while (kolumny <= size);
            wiersze++;
            System.out.println();
        } while (wiersze <= size);
    }
}
