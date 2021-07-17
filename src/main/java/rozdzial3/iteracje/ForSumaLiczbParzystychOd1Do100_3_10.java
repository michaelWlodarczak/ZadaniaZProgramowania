package iteracje;

public class ForSumaLiczbParzystychOd1Do100_3_10 {
    public static void main(String[] args) {
        int i, suma = 0;
        System.out.println("Program sumuje liczby parzyste od 1 do 100");
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 = " + suma);

    }
}
