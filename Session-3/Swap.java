
class Swap {
    public static int[] swapMethod(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        int[] res = new int[2];
        res[0] = a;
        res[1] = b;
        return res;
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 13;
        int[] x = swapMethod(a, b);
        System.out.println("After swap a and b values are " + x[0] + " " + x[1]);
    }
}