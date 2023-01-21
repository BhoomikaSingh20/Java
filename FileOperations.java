package practiceprograms;

import java.util.*;
import java.io.*;

public class FileOperations {

    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("A.txt");
            fw.write("Hello! it's been long getting to know how to perform the file operations. not so long though.\nHEre long means few hours.");
            fw.close();
        }catch(Exception e1){
        }
        try {
            FileInputStream fin = new FileInputStream("A.txt");
            FileOutputStream fout = new FileOutputStream("B.txt");
            
            int i = fin.read();
            while (i != -1) {
                if ((char)i!= 'a' ||(char) i != 'e' || (char)i != 'i' ||(char) i != 'o' ||(char) i != 'u' ||(char) i != 'A' ||(char) i != 'E' ||(char) i != 'I' ||(char) i != 'O' ||(char) i != 'U') {
                    fout.write(i);
                }
                fin.close();
                fout.close();
            }
        }
            catch(IOException e){
           }
        try {
            FileReader fr = new FileReader("B.txt");
            BufferedReader buffer = new BufferedReader(fr);
            String line = buffer.readLine();
            while (line==null){
                System.out.println(line);
            }
        }catch(Exception e1){
        }
    }
}
