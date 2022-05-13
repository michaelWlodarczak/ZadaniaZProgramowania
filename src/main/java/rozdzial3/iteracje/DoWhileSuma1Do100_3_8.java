package rozdzial3.iteracje;

public class DoWhileSuma1Do100_3_8 {
    public static void main(String[] args) {
        int x = 1;
        int suma =0;
        System.out.println("Program wypisuje sume liczb od 1 do 100");
        do {
            suma += x;
            x++;
        }while (x<=100);
        System.out.println("Suma liczb calkowitych od 1 do 100 = " + suma);
    }
}
