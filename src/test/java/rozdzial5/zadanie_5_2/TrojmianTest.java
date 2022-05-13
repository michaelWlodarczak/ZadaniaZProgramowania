package rozdzial5.zadanie_5_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TrojmianTest {


    @Test
    void czytajDaneCzyJestLiczbaANieTekst() {
        //test ma za zadanie wykazać, ze uzytkownik podal wartosc liczbowa a nie tekst,
        //test nie przejdzie dla stringa
        //Given
        Random r = new Random();
        //double a;
        String b;
        //a = Math.round(r.nextDouble());
        b = "tekst urzytkownika";
        //When
        double expectedDouble = Math.round(r.nextDouble());
        //Then
        //Assertions.assertEquals(expectedDouble,a);
        Assertions.assertEquals(expectedDouble, b);
    }

    @Test
    void czytajDaneWartoscRoznaOdZero() {
        //Given
        double a;
        a = 0;
        //When
        double expectedValue = 0;
        //Then
        Assertions.assertEquals(expectedValue, a);

    }

    @Test
    void przetworzDaneObliczDelte() {
        //Given
        double a, b, c, delta;
        a = 1;
        b = 3;
        c = 1;
        delta = b * b - 4 * a * c;
        //When
        double expectedDelta = 5;
        //Then
        Assertions.assertEquals(expectedDelta, delta);
    }

    @Test
    void przetworzDaneJednoRozwiazanie() {
        //Given
        double a, b, x1;
        a = 1;
        b = 1;
        x1 = -b / (2 * a);
        //When
        double expectedValue = -0.5;
        //Then
        Assertions.assertEquals(expectedValue, x1);
    }

    @Test
    void przetworzDaneDwaRozwiazania() {
        //Given
        double a, b,c,delta, x1,x2;
        a = -3;
        b = 3;
        c = 3;
        delta=b*b-4*a*c;
        x1 = (-b - Math.sqrt(delta)) / (2 * a);
        x2 = (-b + Math.sqrt(delta)) / (2 * a);
        //When
        double expectedValueX1 = 1.62;
        double expectedValueX2 = -0.62;
        //Then
        Assertions.assertEquals(expectedValueX1,x1,0.01);
        Assertions.assertEquals(expectedValueX2,x2,0.01);
    }

}