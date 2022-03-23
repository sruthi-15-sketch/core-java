import java.util.*;

class compute {
    public void add(int a, int b) {
        System.out.println("Addition of " + a + " and " + b + " gives " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction of " + a + " and " + b + " gives " + (a - b));
    }

    public void mul(int a, int b) {
        System.out.println("Multiplication of " + a + " and " + b + " gives " + (a * b));
    }

    public void div(int a, int b) {
        if (b != 0)
            System.out.println("Division of " + a + " and " + b + " gives " + (a / b));
        else
            System.out.println("Division by zero is not possible");
    }

    public void mod(int a, int b) {
        System.out.println("Modulo of " + a + " and " + b + " gives " + (a % b));
    }
}

class calculator {
    public static void main(String args[]) {
        Scanner o = new Scanner(System.in);
        System.out.println("Select the operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulo");
        int choice = o.nextInt();
        System.out.println("Enter the 2 values");
        int a = o.nextInt();
        int b = o.nextInt();
        compute x = new compute();
        switch (choice) {
            case 1:
                x.add(a, b);
                break;
            case 2:
                x.sub(a, b);
                break;
            case 3:
                x.mul(a, b);
                break;
            case 4:
                x.div(a, b);
                break;
            case 5:
                x.mod(a, b);
                break;
            default:
                System.out.println("Wrong Choice");
        }

    }
}