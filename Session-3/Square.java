import java.util.*;

class SquareCal {
    public int sqMethod(int a) {
        return a * a;
    }
}

class Square {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = o.nextInt();
        SquareCal s = new SquareCal();
        System.out.println(s.sqMethod(n));
    }
}