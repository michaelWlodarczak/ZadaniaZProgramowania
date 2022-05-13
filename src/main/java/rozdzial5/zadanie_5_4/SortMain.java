package rozdzial5.zadanie_5_4;

public class SortMain {
    public static void main(String[] args) {
        SortClass sort = new SortClass();
        int n=19;
        int[]matrix=new int[n];

        sort.readData(matrix,n);
        sort.processData(matrix,n);
        sort.displayResult(matrix,n);
    }
}
