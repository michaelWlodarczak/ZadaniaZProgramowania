package rozdzial5.zadanie_5_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee extends Person{

    String education;
    String occupation;

    @Override
    public void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        super.init();
        System.out.println("Education: ");
        education = br.readLine();
        System.out.println("Occupation: ");
        occupation = br.readLine();
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Education: " + education + ".");
        System.out.println("Occupation: " + occupation + ".");
    }
}
