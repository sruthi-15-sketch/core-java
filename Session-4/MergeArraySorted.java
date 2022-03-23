import java.util.Scanner;

class MergeArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of Array1: ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Size of  Array2: ");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            res[k] = arr1[i];
            i++;
            k++;
        }
        while (j < n) {
            res[k] = arr2[j];
            j++;
            k++;
        }
        for (int l = 0; l < k; l++) {
            System.out.print(res[l] + " ");
        }
    }
}
