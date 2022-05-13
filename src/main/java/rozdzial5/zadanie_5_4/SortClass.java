package rozdzial5.zadanie_5_4;

import java.util.*;

public class SortClass implements SortInterface {
//    @Override
//    public void readData(int[] nums, int n) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert " + n + " numbers: ");
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//        System.out.println("Not sorted numbers: " + Arrays.toString(nums));
//    }

    @Override
    public void readData(int[] nums, int n){
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            nums[i] = (int) Math.round(100 * (r.nextDouble()));
            if (i< n-1)
                System.out.print(nums[i] + ", ");
            else
                System.out.print(nums[i] + ".\n");
        }
    }


    @Override
    public void processData(int[] nums, int n) {
        int x = 0;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i; --j) {
                if (nums[j - 1] > nums[j]) {
                    x = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = x;
                }
            }
        }
    }
//    ArrayList numb = new ArrayList();
//        numb.add(numbers);
//        Collections.sort(numb);

    @Override
    public void displayResult(int[] nums, int n) {
        System.out.println("Bubble sort: ");
        for (int i = 0; i < n; i++) {
            if (i < n - 1)
                System.out.print(nums[i] + ", ");
            else
                System.out.print(nums[i] + ".");
        }

    }
}
