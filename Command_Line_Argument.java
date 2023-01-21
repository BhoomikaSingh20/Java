package IOPack;
import java.io.*;

public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        int i;
        try ( FileInputStream in = new FileInputStream("E:\\JAVA1\\a.txt");  FileOutputStream out = new FileOutputStream("E:\\JAVA1\\b.txt")) {
            do {
                i = in.read();
                if (i != -1) {
                    out.write(i);
                }
            } while (i != -1);
        }
    }
}
