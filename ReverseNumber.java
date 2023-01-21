/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naina
 */

import java.util.*;
public class ReverseNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Integer: ");
        int num = sc.nextInt();
        String reverse = ""; 
        while (num!=0){
            reverse += num%10;
            num = num/10;
        }
        System.out.println("Reversed number is: " +reverse);
    }
}
