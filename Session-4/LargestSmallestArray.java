import java.util.Scanner;

class LargestSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of an Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum and Minimum elements of an array are " + max + " " + min + " respectively.");
    }
}
