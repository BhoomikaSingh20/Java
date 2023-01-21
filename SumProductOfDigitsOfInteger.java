/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naina
 */
import java.util.*;
public class SumProductOfDigitsOfInteger {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any digit integer: ");
        int num = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while (num!=0){
            sum += num%10;
            prod *= num%10;
            num = num/10;
        }
        System.out.println("Sum of Digits of the Integer: " +sum);
        System.out.println("Product of Digits of the Integer: " +prod);
    }
}
