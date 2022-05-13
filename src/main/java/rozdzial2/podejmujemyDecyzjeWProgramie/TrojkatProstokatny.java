package rozdzial2.podejmujemyDecyzjeWProgramie;

import java.util.Scanner;

public class TrojkatProstokatny {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj trzy boki trojkąta \nprogram sprawdzi, czy jest to trojkat prostokatny");
        System.out.println("Bok a = ");
        int a = input.nextInt();
        System.out.println("Bok b = ");
        int b = input.nextInt();
        System.out.println("Bok c = ");
        int c = input.nextInt();
        if ((a*a + b*b) == c*c) {
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworza trojkat prostokatny.");
        }else if ((a*a + c*c) == b*b) {
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworza trojkat prostokatny.");
        }else if ((b*b + c*c) == a*a){
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworza trojkat prostokatny.");
        }else {
            System.out.println("Boki: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("nie towrza trojkata prostokatnego");
        }
    }
}