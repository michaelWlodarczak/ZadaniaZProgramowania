package rozdzial1.prosteOperacjeWejsciaWyjscia;

import java.util.Scanner;

public class VolumeOfASphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promien kuli: ");
        double r = input.nextDouble();
        double volume = (4*Math.PI*r*r*r/3);
        System.out.println("Objetosc kuli o promieniu r = " + r + " wynosi: " + volume);
    }
}