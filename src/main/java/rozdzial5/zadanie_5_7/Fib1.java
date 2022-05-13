package rozdzial5.zadanie_5_7;

public class Fib1 {

    public long fibRecursion(int n){
        switch (n){
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return fibRecursion(n-1)+ fibRecursion(n-2);
        }
    }

    public long fibForLoop(int n){
        long x = 1;
        long y = 1;
        for (int i = 3; i <= n ; i++) {
            long z = x + y;
            x = y;
            y = z;
        }
        return y;
    }
}
