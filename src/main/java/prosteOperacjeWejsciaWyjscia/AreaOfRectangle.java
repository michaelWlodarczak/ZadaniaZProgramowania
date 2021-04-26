package prosteOperacjeWejsciaWyjscia;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program obliczy pole prostokata: ");
        System.out.println("Podaj dlugosc boku a: ");
        double a = input.nextInt();
        System.out.println("Podaj dlugosc boku b: ");
        double b = input.nextInt();
        double pole = a * b;
        System.out.println("Pole prostokata o boku " + a + " i boku " + b + " wynosi " + pole);
    }
}