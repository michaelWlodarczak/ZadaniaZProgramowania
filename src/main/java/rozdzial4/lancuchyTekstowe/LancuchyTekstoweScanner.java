package lancuchyTekstowe;

import java.util.Scanner;

public class LancuchyTekstoweScanner {
    public static void main(String[] args) {
        String name, surname;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programme is measuring lenght of 'name' i 'surname'");
        System.out.println("What's your name?");
        name = sc.nextLine();
        System.out.println("What's your surname?");
        surname = sc.nextLine();
        System.out.println("Name " + name + " contains " + name.length() + " letters");
        System.out.println("Surname " + surname + " contians " + surname.length() + " letters");
    }
}
