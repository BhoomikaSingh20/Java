
import java.util.*;

public class PrimeOrNot {

    static boolean prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number of terms: ");
        int n = sc.nextInt();
        System.out.print("Enter m starting from: ");
        int m = sc.nextInt();
   
        System.out.print("1. first " + n + " prime numbers: ");
        int count = 0;
        while (count <= n) {
            for (int k = 2;;k++) {
                if (prime(k)) {
                    System.out.print(k + " ");
                    count++;
                }   
            }
        }
        System.out.println();
        
        System.out.print("2. Prime numbers upto " + n + " : ");
        for (int j = 2; j <= n; j++) {
            if (prime(j)) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        int countn = 0;
        System.out.print("3. " + n + " prime numbers starting from " + m + " are: ");
        while(countn<=n){
            for(int i=m; ;i++){
                if(prime(i)){
                System.out.print(i + " ");
                count++;
                }
            }
        }
    }
}
