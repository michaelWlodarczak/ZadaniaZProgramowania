package rozdzial5.zadanie_5_6;

public class LiczbyTrojkatne {

    public static int triangle(int n){

        if(n==1){
            return 1;
        }else {
            return (n + triangle(n-1));
        }

    }
}
