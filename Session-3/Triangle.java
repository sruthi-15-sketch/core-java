import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter first side: ");
        a = sc.nextDouble();
        System.out.print("Enter second side: ");
        b = sc.nextDouble();
        System.out.print("Enter third side: ");
        c = sc.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c)
                System.out.println("Equilateral Triangle.");
            else if (a == b || b == c || c == a)
                System.out.println("Isosceles Triangle.");
            else
                System.out.println("Scalene Triangle.");
        } else
            System.out.println("Triangle not possible.");
    }
}