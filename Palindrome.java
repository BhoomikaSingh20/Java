
import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string: ");
        String word = sc.next();
        int len = word.length()-1;
        String reverse = "";
        while(len>=0){
            var w = word.charAt(len);
            reverse+=w;
            len--;
        }
        System.out.println("**************************************");
        if (word.equals(reverse)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("NOT Palindrom!");
        }
    }  
}
