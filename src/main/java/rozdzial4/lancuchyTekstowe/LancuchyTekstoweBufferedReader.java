package rozdzial4.lancuchyTekstowe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LancuchyTekstoweBufferedReader {
    public static void main(String[] args) throws IOException {
        String name, surname;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Programme is measuring lenght of 'name' i 'surname'");
        System.out.println("What's your name?");
        name = br.readLine();
        System.out.println("What's your surname?");
        surname = br.readLine();
        System.out.println("Name " + name + " contains " + name.length() + " letters");
        System.out.println("Surname " + surname + " contians " + surname.length() + " letters");
    }
}
