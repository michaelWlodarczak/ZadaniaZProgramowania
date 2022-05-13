package rozdzial3.iteracje;

public class ForAdoZZdoA {
    public static void main(String[] args) {
        System.out.println("Program wyswietla duze litery alfabetu od A do Z i od Z do A za pomoca petli For");
        char znak;
        for (znak = 'A'; znak <='Z'; znak++){
            if (znak < 'Z'){
                System.out.print(znak + ",");
            }else {
                System.out.println(znak + ".");
            }
        }
        for (znak = 'Z'; znak >= 'A'; znak--){
            if (znak > 'A'){
                System.out.print(znak + ",");
            }else {
                System.out.println(znak + ".");
            }
        }

    }
}
