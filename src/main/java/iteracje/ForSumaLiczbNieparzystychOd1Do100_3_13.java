package iteracje;

public class ForSumaLiczbNieparzystychOd1Do100_3_13 {
    public static void main(String[] args) {
        int i, suma = 0;
        System.out.println("Program sumuje liczby parzyste od 1 do 100");
        for (i = 1; i <= 100; i++) {
            if (!(i % 2 == 0)) {
           // if (i % 2 != 0) {  takie rozwiazanie tez jest mozliwe
                suma += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 = " + suma);

    }
}
