package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Zadanie_4_18 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Hania");
        list.add("Michal");
        list.add("Krzys");
        list.add("Ania");
        list.add("Krystian");
        list.add("Martyna");

        System.out.println("List displayed in adding order: ");
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                System.out.println(list.get(i)+",");
            }else {
                System.out.println(list.get(i)+".\n");
            }
        }

        //Collections.reverse(list);
        System.out.println("Sorted list in alphabetical order: ");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i<list.size()-1){
                System.out.println(list.get(i)+",");
            }else {
                System.out.println(list.get(i)+".\n");
            }
        }

        System.out.println("Third element removed and new element added: ");
        list.remove(2);
        list.add("Fifonż");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("\nSorted list once again: "+"\n"+list);


    }
}
