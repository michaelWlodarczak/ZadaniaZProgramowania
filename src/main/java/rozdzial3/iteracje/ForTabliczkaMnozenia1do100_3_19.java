package rozdzial3.iteracje;

public class ForTabliczkaMnozenia1do100_3_19 {
    public static void main(String[] args) {
        System.out.println("Program wyswietlajacy tabliczke mnozenia dla liczb z przedzialu od 1 do 100 z wykorzystaniem podwojnej petli for");
        int size = 10;
        int wiersze = 10;
        int kolumny = 10;
        for (wiersze = 1; wiersze <= size; wiersze++) {
            for (kolumny = 1; kolumny <=size; kolumny++){
                System.out.print(wiersze*kolumny + "\t");
            }
            System.out.println();
        }
    }
}
