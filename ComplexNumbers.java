
import java.util.*;

class Complex {
    int x;
    int y;
    Complex(int real, int img) {
        x = real;
        y = img;
    }
    public Complex sum(Complex c) {
        x += c.x;
        y += c.y;
        return (this);
    }
    public Complex multiply(Complex c) {
        Complex prod = new Complex(0, 0);
        prod.x = x * c.x - y * c.y;
        prod.y = x * c.y + c.x * y;
        return prod;
    }
    public String toString() {
        return x + " + i " + y;
    }
}

class Program_1 {
    public static void main(String[] args) {
        int opt = 0;
        int r1, i1, r2, i2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in complex form \n");
        System.out.println("Enter real part: ");
        r1 = sc.nextInt();
        System.out.println("Enter imaginary part: ");
        i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        System.out.println("Complex Number 1: " + c1.toString());
        System.out.println("Enter another number in complex form \n");
        System.out.println("Enter real part: ");
        r2 = sc.nextInt();
        System.out.println("Enter imaginary part: ");
        i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);
        System.out.println("Complex Number 2: " + c2.toString());
        do {
            System.out.println("CHOICES");
            System.out.println("1) Addition of two complex number");
            System.out.println("2) Multiplication of two complex number");
            System.out.println("3) Exit");
            System.out.println("\nEnter your choice : ");
            opt = sc.nextInt();
            System.out.println();
            if (opt == 1) {
                System.out.println("SUM: " + c1.sum(c2));
                c1.toString();
            } else if (opt == 2) {
                System.out.println("PRODUCT: " + c1.multiply(c2));
                c1.toString();
            } else {
                System.out.println("INVALID OPTION!!!");
            }
        } while (opt != 3);
    }
}
