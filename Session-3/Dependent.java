import java.util.Scanner;

public class Dependent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m value : ");
        int m = sc.nextInt();
        int n;
        if (m > 0)
            n = 1;
        else if (m == 0)
            n = 0;
        else
            n = -1;
        System.out.println("n value : " + n);
    }
}