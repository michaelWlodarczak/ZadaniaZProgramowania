package rozdzial4.collections;

import java.util.ArrayList;
import java.util.Collections;

public class DemoClassCastException {
    public static void main(String[] args) {
        try {

            ArrayList list = new ArrayList();
            list.add("Hania");
            list.add(19);
            list.add("Krzys");
            list.add(14);
            list.add(-15);
            list.add("Michal");

            System.out.println("List displayed in adding order: ");
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    System.out.println(list.get(i) + ",");
                } else {
                    System.out.println(list.get(i) + ".\n");
                }
            }

            System.out.println("Sorted list in alphabetical order: ");
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (i < list.size() - 1) {
                    System.out.println(list.get(i) + ",");
                } else {
                    System.out.println(list.get(i) + ".\n");
                }
            }
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
    }
}
