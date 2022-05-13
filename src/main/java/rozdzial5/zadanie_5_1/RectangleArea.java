package rozdzial5.zadanie_5_1;


import java.util.Scanner;

public class RectangleArea {
    double a,b,area;

    public void czytajDane(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is calculating area of rectangle\nInput 'a': ");
        a=sc.nextDouble();
        System.out.println("Input 'b': ");
        b=sc.nextDouble();
    }

    public void przetworzDane(){
        area=a*b;
    }

    public void wyswietlWynik(){ //wyniki sa zaokraglone do drugiego miejsca po przecinku
        //System.out.println("'a' = " + a + "\n'b' = " + b + "\narea = " + area);
        System.out.println("a = ");
        System.out.printf("%2.3f",a);
        System.out.println("\nb = ");
        System.out.printf("%2.2f",b);
        System.out.println("\narea = ");
        System.out.printf("%2.2f",area);
    }

}
