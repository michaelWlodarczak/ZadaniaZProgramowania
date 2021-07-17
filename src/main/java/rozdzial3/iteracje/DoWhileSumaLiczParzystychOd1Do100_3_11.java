package iteracje;

public class DoWhileSumaLiczParzystychOd1Do100_3_11 {
    public static void main(String[] args) {
        int x = 1;
        int suma = 0;
        System.out.println("Program wypisze sume liczb parzystych w zakresie od 1 do 100: ");
        do {
            if (x % 2 == 0)
                suma += x;  // to samoco: suma = suma + x;
            x++;
        } while (x <= 100);
        System.out.println(suma);
    }
}
