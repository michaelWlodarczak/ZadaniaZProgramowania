package rozdzial5.zadanie_5_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void czytajDane(){
        //test ma za zadanie wykazać, ze uzytkownik podal wartosc liczbowa a nie tekst,
        //test nie przejdzie dla stringa
        //Given
        Random r = new Random();
        double a;
        //String b;
        a = Math.round(r.nextDouble());
        //b = "tekst urzytkownika";
        //When
        double expectedDouble = Math.round(r.nextDouble());
        //Then
        Assertions.assertEquals(expectedDouble,a);
        //Assertions.assertEquals(expectedDouble,b);
    }

    @Test
    void przetworzDane() {
        //Given
        double a, b, area;
        a = 2;
        b = 3;
        area = a * b;
        //When
        double expectedResult = 6;
        //Then
        Assertions.assertEquals(expectedResult, area);
    }
//TODO - dokonczyc ponizszy test
    @Test
    void wyswietlWynik(){
        //test ma sprawdzic, czy wyniki beda prezentowane z zaokragleniem do dwuch miejsc po przecinku
        //Given
        double a;
        a = Math.PI;
        //When
//        double expectedValue = 3.14;
        //Then
        Assertions.assertEquals(3.14,a,0.01);
    }
    @Test
    public void shouldDivideNumbers() {
        double result = 1 / 3.;
        Assertions.assertEquals(0.333, result, 0.01);
    }
}