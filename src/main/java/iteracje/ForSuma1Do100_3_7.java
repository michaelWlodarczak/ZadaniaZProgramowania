package iteracje;

public class ForSuma1Do100_3_7 {
    public static void main(String[] args) {
        int x;
        int suma = 0;
        System.out.println("Program wypisuje sume liczb od 1 do 100");
        for (x=1; x<=100; x++){
            suma +=x;
            System.out.println("Suma liczb od 1 do 100 wynosi = " + suma);
        }
    }
}
