import java.nio.file.*;
import java.io.*;

public class CopyFile {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("C:\\Users\\91801\\Desktop\\Core-java\\Session-2\\text1.txt");
            FileWriter fw = new FileWriter("C:\\Users\\91801\\Desktop\\Core-java\\Session-3\\text2.txt");
            String s = "";
            int c;
            while ((c = fr.read()) != -1) {
                s += (char) c;
            }
            fw.write(s);
            BufferedReader br = new BufferedReader(new FileReader("text2.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
