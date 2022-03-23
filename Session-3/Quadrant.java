import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        System.out.println("Enter the coordinates x , y : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0)
            System.out.println(x + " " + y + " " + "belongs to quadrant-1");
        else if (x < 0 && y > 0)
            System.out.println(x + " " + y + " " + "belongs to quadrant-2");
        else if (x < 0 && y < 0)
            System.out.println(x + " " + y + " " + "belongs to quadrant-3");
        else
            System.out.println(x + " " + y + " " + "belongs to quadrant-4");
    }
}