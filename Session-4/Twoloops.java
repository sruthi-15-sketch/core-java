import java.util.Scanner;

class Twoloops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
            System.out.print(sum + " " + "(");
            for (int j = 1; j <= i; j++) {
                if (j == i)
                    System.out.print(j);
                else
                    System.out.print(j + "+");
            }
            System.out.print(")");
            System.out.println();
        }
        int total = 0;
        int num = 0;
        int c = 0;
        while (total < 100) {
            total += num;
            if (total + num + 1 > 100) {
                break;
            }
            num++;
            c++;
        }
        System.out.println(
                "The number of digits required to get a sum less than 100 is " + c + " and the sum is " + total);
    }
}
