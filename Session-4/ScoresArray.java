import java.util.*;

class ScoresArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() + 1;
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[10 - 1 - i]);
        }
    }
}