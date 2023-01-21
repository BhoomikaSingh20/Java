package P1;

abstract public class Shape {

    public abstract void input();

    public abstract double Area();

}

package P2; 

import P1.*;

import java.util.*; 

 

public class Rectangle extends Shape {

    double l, b;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");

        l = sc.nextDouble();

        System.out.print("Enter the breadth of rectangle : ");

        b = sc.nextDouble();

    }

    public double Area() {

        return l * b;

    }

}

package P3; 

import P1.*;

import java.util.*; 

 

public class Circle extends Shape {

    double r;

    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius of circle : ");

        r = sc.nextDouble();

    }

    public double Area() {

        return 3.14 * r * r;

    }

}

import P1.*; 

import P2.*; 

import P3.*;

import java.util.*; 
 
public class Main {
    public static void main(String[] args) {
        int opt;
        Shape s;
        Rectangle r;
        do {
            System.out.println();
            System.out.println("CHOICES");
            System.out.println("1)Rectangle");
            System.out.println("2)Circle");
            System.out.println("3)Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter your choice : ");
            opt = sc.nextInt();
            System.out.println();
            if (opt == 1) {
                r = new Rectangle();
                r.input();
                System.out.print("Area of rectangle is  : ");
                System.out.println(r.Area());
            } else if (opt == 2) {
                s = new Circle();
                s.input();
                System.out.print("Area of circle is  : ");
                System.out.println(s.Area());
            } else {
                System.out.println("Invalid Option");
            }
        } while (opt != 3);
    }
}
