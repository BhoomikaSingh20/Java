package practiceprograms;

import java.io.*;
import java.util.*;

public class FilleHandling {

    public static void main(String args[]) {
        File f1 = new File("first.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter("first.txt");
            fw.write("This is my First File in Java. I am gonna perform some operations on this file now. So let's start.");
            fw.close();
        } catch (IOException e) {
        }
        File f2 = new File("first.txt");
        try {
            String line = "";
            FileReader fb = new FileReader("first.txt");
            BufferedReader buffer = new BufferedReader(fb);
            
            while((line = buffer.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (IOException e) {
        }
    }
}
