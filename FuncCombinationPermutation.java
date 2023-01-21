
import java.util.*;
public class FuncCombinationPermutation {
    static int fact(int n){
            int x=1;
            int j=1;
            while (x<=n){
                j*=x;
                x++;
            }
            return j;
        }
        static int combination(int n, int r){
            int combi = fact(n)/(fact(r)*fact(n-r));
            return combi;
        }
        static int permutation(int n, int r){
            int permu = fact(n)/fact(n-r); 
            return permu;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n = sc.nextInt();
        System.out.print("Enter value of r:");
        int r = sc.nextInt();
        if (n<r){
            System.out.println("Invalid vlues: n<r");
        }
        else{
            System.out.println("Combination, nCr is: " +combination(n,r));
            System.out.println("Permutation, nPr is: " +permutation(n,r));
        }
    }
}
