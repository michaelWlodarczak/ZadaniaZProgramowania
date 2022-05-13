package rozdzial5.zadanie_5_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

    String surname;
    String name;
    String street;
    String postal_code;
    String city;

    public void init() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert data: ");
        System.out.println("Surname: ");
        surname = br.readLine();
        System.out.println("Name: ");
        name = br.readLine();
        System.out.println("Street: ");
        street = br.readLine();
        System.out.println("Postal code: ");
        postal_code = br.readLine();
        System.out.println("City: ");
        city = br.readLine();
        System.out.println();
    }

    public void printData() {
        System.out.println("Display data: \n" + "=================");
        System.out.println("Surname: " + surname + ".");
        System.out.println("Name: " + name + ".");
        System.out.println("Street: " + street + ".");
        System.out.println("Postal code: " + postal_code + ".");
        System.out.println("City: " + city + ".");
    }
}
