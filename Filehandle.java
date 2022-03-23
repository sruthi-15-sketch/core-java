import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Filehandle {
    public static void main(String[] args) throws IOException {
        File file = new File("playground.txt");
        Scanner sc = new Scanner(file);
        String x = sc.nextLine();
        String res1 = x.substring(0, 5) + '@' + x.substring(5);
        String[] m = res1.split(" ");
        m[1] = m[1] + "123";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < m.length; i++) {
            sb.append(m[i] + " ");
        }
        String str = sb.toString();
        System.out.println(str);
        sc.close();
        FileWriter fw = new FileWriter("playground.txt");
        fw.write(str);
        fw.close();
    }
}