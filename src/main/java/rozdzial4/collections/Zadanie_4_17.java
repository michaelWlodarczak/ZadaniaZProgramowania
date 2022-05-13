package rozdzial4.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie_4_17 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();  //utworzenie obiektu klasy ArrayList

        list.add(20);
        list.add(-4);
        list.add(25);
        list.add(90);
        list.add(14);
        list.add(-19);

        System.out.println(list); //wypisanie listy po kolei

        for (int i = 0; i < list.size(); i++) { // iteracja po liscie, wypisanie po przecinku (indeks po indeksie)
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + ",");
            } else {
                System.out.print(list.get(i) + ".");
            }
        }
        Collections.sort(list);  //sortowanie listy
        System.out.println("\nSorted list:" + list);
        //dodam nowy element do posortowanej listy, ktory zostanie dodany na koncu i lista nie bedzie juz posorotwana
        list.remove(1);
        list.add(10);
        System.out.println("\nSecond element has been removed and " + "\nnew element has been added to sorted list, " +
                "\nwhich is added at the end makes list not sorted anymore: " + "\n" + list);

        Collections.sort(list);
        System.out.println("Sorted once again: ");
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                System.out.println(list.get(i) + ",");
            }else {
                System.out.println(list.get(i) + ".");
            }
        }
        System.out.println(list);

    }
}
