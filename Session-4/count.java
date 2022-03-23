import java.util.Scanner;

class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        int cap = 0, low = 0, num = 0, x = 0;
        int len = p.length();
        for (int i = 0; i < len; i++) {
            x = (int) p.charAt(i);
            if (x >= 65 && x <= 90) {
                cap++;
            } else if (x >= 97 && x <= 122) {
                low++;
            } else if (x >= 48 && x <= 57) {
                num++;
            }
        }
        System.out.println("Capital,Lower,Numerical counts are " + cap + " " + low + " " + num + " respectively");
    }
}
