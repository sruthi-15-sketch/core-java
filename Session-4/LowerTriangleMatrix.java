import java.util.Scanner;

class LowerTriangleMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the number columns of matrix: ");
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i >= j) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
