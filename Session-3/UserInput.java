import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String str = "";
        do {
            str = sc.next();
            c++;
        } while (!(str.charAt(0) == 'q'));
        System.out.println(c - 1);
    }
}