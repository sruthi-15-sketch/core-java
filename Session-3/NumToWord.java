import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a number ranging from 0 -9 : ");
        int num = sc.nextInt();
        switch (num) {
            case 0:
                System.out.println("The number selected is zero");
                break;
            case 1:
                System.out.println("The number selected is one");
                break;
            case 2:
                System.out.println("The number selected is two");
                break;
            case 3:
                System.out.println("The number selected is three");
                break;
            case 4:
                System.out.println("The number selected is four");
                break;
            case 5:
                System.out.println("The number selected is five");
                break;
            case 6:
                System.out.println("The number selected is six");
                break;
            case 7:
                System.out.println("The number selected is seven");
                break;
            case 8:
                System.out.println("The number selected is eight");
                break;
            case 9:
                System.out.println("The number selected is nine");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}