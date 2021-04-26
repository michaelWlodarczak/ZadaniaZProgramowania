package podejmujemyDecyzjeWProgramie;
import java.io.*;
import java.util.*;

public class ZgadywanieLiczby {
    public static void main(String[] args) {
        double losuj_liczbe, zgadnij_liczbe;
        Scanner input = new Scanner(System.in);
        System.out.println("Program losuje liczbe zprzedzialu od 0 - 9 \nzgadnij ta liczbe");
        Random random = new Random();
        losuj_liczbe = Math.round(10*(random.nextDouble()));
        zgadnij_liczbe = input.nextDouble();
        if(losuj_liczbe == zgadnij_liczbe){
            System.out.println("Gratulacje! Odgadles liczbe!");
        }else {
            System.out.println("Niestety;( wylosowana liczba to " + losuj_liczbe);
        }
    }
}
