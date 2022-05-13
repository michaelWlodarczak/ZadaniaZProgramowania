package rozdzial3.iteracje;

public class WhileSuma1Do100_3_9 {
    public static void main(String[] args) {
        int x = 1;
        int suma = 0;
        System.out.println("Program sumuje liczby calkowite od 1 do 100 ");
        while (x <=100){
            suma += x;
            x++;
        }
        System.out.println(suma);
    }
}
