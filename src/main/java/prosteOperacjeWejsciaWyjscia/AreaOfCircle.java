package prosteOperacjeWejsciaWyjscia;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj srednice okregu d: ");
        double d = input.nextDouble();
        double Pi = Math.PI;
        double area = (Math.pow(d/2,2)) * Pi;
        System.out.println("Pole okregu o srednicy d = " + d + " rowna sie = " + area);
    }
}