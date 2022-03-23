import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        System.out.println("Enter a,b,c values : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c)
            System.out.println(a + " is the largest");
        else if (b > a && b > c)
            System.out.println(b + " is the largest");
        else
            System.out.println(c + " is the largest");
        if (a < b && a < c)
            System.out.println(a + " is the Smallest");
        else if (b < a && b < c)
            System.out.println(b + " is the Smallest");
        else
            System.out.println(c + " is the Smallest");
    }
}