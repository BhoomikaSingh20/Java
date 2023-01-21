package practiceprograms;

//import java.util.*;
public class matrix {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int matrix[][] = new int[4][4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
//                if (i == j) {
//                    matrix[i][j] = 1;
//                    System.out.print(matrix[i][j] + " ");
//                }
//                else{
                matrix[i][j] = sum;
                System.out.print(matrix[i][j] + " ");
                sum += 1;
//            }
            }
            System.out.println();
        }
        
        
    }
}
