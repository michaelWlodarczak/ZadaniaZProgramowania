package iteracje;

public class WhileSumaLiczParzystychOd1Do100_3_12 {
    public static void main(String[] args) {
        int x = 1, suma =0;
        System.out.println("Program sumuje liczby parzyste od 1 do 100");
        while (x <=100){
            if (x%2 ==0)
            suma += x;
            x++;
        }
        System.out.println(suma);
    }
 }
