import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the physics,chemistry,math marks : ");
        int tot = sc.nextInt();
        tot += sc.nextInt();
        tot += sc.nextInt();
        if (tot >= 270)
            System.out.println("The grade is A");
        else if (tot >= 220)
            System.out.println("The grade is B");
        else if (tot >= 170)
            System.out.println("The grade is C");
        else if (tot >= 110)
            System.out.println("The grade is D");
        else
            System.out.println("Fail");
    }
}