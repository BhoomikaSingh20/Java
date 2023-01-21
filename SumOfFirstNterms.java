

import java.util.*;

public class SumOfFirstNterms {
    static double fact(double num){
            int i=1;
            int j=1;
            while(i<=num){
                j*=i;
                i++;
            }
            return j;
        }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number of digits: ");
        int n = sc.nextInt();
        
        System.out.println("Compute Sum of first 'n' terms of following series: ");
        System.out.println();
        double sum = 0;
        for(float i=1; i<=n; i++){
            sum = sum+(1/i);
        }
        System.out.println("1. 1 + 1/2 + 1/3 + 1/4 + ...   = " +sum);
        
        System.out.println();
        double sum1 = 0; 
        for (double j=1; j<=n; j++){
            sum1 = sum1+(1/fact(j));
        }
        System.out.println("2. 1 + 1/2! + 1/3! + 1/4! + ...= " +sum1);
        
        System.out.println();
        int sum2 = 0;
        for(int i=2; i<=n; i++){
            sum2 = sum2+((i-1)-i);
        }
        System.out.println("3. 1-2 + 3-4 + ...             = " +sum2);
    }
}
 
