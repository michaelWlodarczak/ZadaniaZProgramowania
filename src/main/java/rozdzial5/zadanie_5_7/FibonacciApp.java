package rozdzial5.zadanie_5_7;

/*
Program ktory znajduje 10 pierwszych liczb ciagu Fibonacciego i wyswietla je na ekranie komputera.
 */
public class FibonacciApp {
    public static void main(String[] args) {

        int n =10;
        Fib1 fib1 = new Fib1();

//        System.out.println("For loop: " + fib1.fibForLoop(n));

        for (int i = 0; i < n; i++) {
            System.out.println("Recursion: " + fib1.fibRecursion(i));
        }

    }
}
