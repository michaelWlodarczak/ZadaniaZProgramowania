package rozdzial4.concat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConcatTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string1, string2;
        System.out.println("Program will merge two strings");
        System.out.println("Type first text: ");
        string1 = br.readLine();
        System.out.println("type second text: ");
        string2 = br.readLine();
        System.out.println(string1 + " + " + string2 + " = " + string1.concat(string2));
        System.out.println(string2 + " + " + string1 + " = " + string2.concat(string1));

        if (string1.equals(string2)){
            System.out.println("Skladanie dwoch rownych lancuchow jest przemienne");
        }else {
            System.out.println("Skladanie dwoch roznych lancuchow nie jest przemienne");
        }

    }
}
