package rozdzial5.zadanie_5_5;

public class Strong implements StrongInterface{

    @Override
    public long strongRecursion(int n) {
            long result = 1;
            if(n >=2){
                result=n* strongRecursion(n-1);
            }
            return result;
        }

        public long strongForLoop(int n){
        long result = 1;
            for (int i = 1; i <= n; i++) {
                result = result*i;
            }
            return result;

        }
}

