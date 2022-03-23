import java.util.*;

public class PrimeExample {
  public static boolean Armstrong(int digit) {
    int num = digit;
    int sum = 0;
    while (digit > 0) {
      sum += Math.pow(digit % 10, 3);
      digit /= 10;
    }
    return num == sum;
  }

  public static int Prime(int digit) {
    int m = digit / 2;
    int flag = 0;
    for (int i = 2; i <= m; i++) {
      if (digit % i == 0) {
        boolean res = Armstrong(digit);
        if (res)
          System.out.println(digit + " is an Armstrong number");
        else
          System.out.println(digit + " is not an Armstrong number");
        flag = 1;
        break;
      }
      if (flag == 1)
        break;
    }
    return (flag);
  }

  public static void main(String args[]) {
    int i, x = 0;
    System.out.println("Enter a value: ");
    Scanner o = new Scanner(System.in);
    int n = o.nextInt();
    for (int j = 1; j <= n; j++) {
      x = Prime(j);
      if (x == 0) {
        System.out.println(j + " is a prime number");
      }
    }
  }
}
