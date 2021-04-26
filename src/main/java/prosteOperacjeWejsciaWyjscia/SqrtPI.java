package prosteOperacjeWejsciaWyjscia;

/* program wypisuje pierwiastek z liczby Pi z dokladnoscia do 2 miejsc po przecinku
zwrocic nalezy uwage na printf a nie println
 */

public class SqrtPI {
    public static void main(String[] args) {
        double Pi = Math.PI;
        System.out.printf("Sqrt(Pi) =  " + "%2.2f\n ", Math.sqrt(Pi));
    }
}
