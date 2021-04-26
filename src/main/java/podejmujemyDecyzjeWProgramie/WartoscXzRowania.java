package podejmujemyDecyzjeWProgramie;

import java.io.IOException;
import java.util.Scanner;

/*oblicz wartosc x z rownania ax + b = c
zabezpieczyc program, zeby wartosc wspolczynnika a != 0
 */

public class WartoscXzRowania {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosc wspolczynnika a ");
        double a,b,c,x;
        a = input.nextDouble();
        if (a == 0){
            System.out.println("Nieprawidlowa wartosc wspolczynnika a");
        }else {
            System.out.println("Podaj wartosc wspolczynnika b ");
            b = input.nextDouble();
            System.out.println("Podaj wartosc wspolczynnika c ");
            c = input.nextDouble();
            x = (c-b)/a;
            System.out.println("Dla a = " + a + "\nb = " + b + "\nc = " + c + "\nWartosc x = " + x);
        }
    }
}
