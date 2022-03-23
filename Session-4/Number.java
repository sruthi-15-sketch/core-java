import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }
        // System.out.println(sum);
        System.out.println((num == sum) ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
