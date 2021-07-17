package iteracje;

public class DoWhileAdoZZdoA {
    public static void main(String[] args) {
        System.out.println("Program wyswietla duze litery alfabetu od A do Z i od Z do A za pomoca petli Do...While");
        char znak;
        znak = 'A';
        do {
            znak++;
            if (znak < 'Z') {
                System.out.print(znak + ",");
            } else {
                System.out.println(znak + ".");
            }
        } while (znak <= 'Z');
        znak = 'Z';
        do {
            znak--;
            if (znak > 'A'){
                System.out.print(znak + ",");
            }else {
                System.out.println(znak + ".");
            }
        }while (znak >= 'A');
    }
}

