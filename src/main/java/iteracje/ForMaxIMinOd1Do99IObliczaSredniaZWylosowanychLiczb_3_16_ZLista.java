package iteracje;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Program za pomoca 'for' znajduje max i min ze zbioru 'n' wylosowanych liczb
//z przdzialu od 0 do 99 (w zadaniau n = 5) oraz oblicza srednia
//ze wszystkich wylosowanych liczb
public class ForMaxIMinOd1Do99IObliczaSredniaZWylosowanychLiczb_3_16_ZLista {
    public static void main(String[] args) {
        System.out.println("Program za pomoca 'for' znajduje max i min ze zbioru 'n' wylosowanych liczb " +
                "\nz przdzialu od 0 do 99 (w zadaniau n = 5) oraz oblicza srednia " +
                "\nze wszystkich wylosowanych liczb");
//todo dokonczyc

        Random r = new Random();
        int n = 5;
        List<Integer> zbiorLiczb = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            zbiorLiczb.add((int) (r.nextDouble() * 100));
        }

        System.out.println(zbiorLiczb);
    }
}

