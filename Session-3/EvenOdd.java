import java.util.*;

class EvenOdd1 {
    public String find1(int a) {
        if (a % 2 == 0)
            return "even";
        else
            return "odd";
    }
}

class EvenOdd {
    public static void main(String args[]) {

        Scanner o = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = o.nextInt();
        EvenOdd1 s = new EvenOdd1();
        System.out.println("The number is " + s.find1(n));
    }
}