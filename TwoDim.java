package P1;
public class TwoDim {
    private int x;
    private int y;
    public TwoDim() {
        x = 0;
        y = 0;
    }
    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return " Co-Ordinate: " + x + "," + y;
    }
}

package P2;
import P1.*; 
 
public class ThreeDim extends TwoDim {
    private int z;
    public ThreeDim() {
        super(0, 0);
        z = 0;
    }
    public ThreeDim(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public String toString() {
        return super.toString() + "" + "," + z;
    }
}

package P; 
import java.util.*; 
import P2.*;
import P1.*; 
public class Dim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first coordinate ");
        int x = sc.nextInt();
        System.out.println("Enter second coordinate ");
        int y = sc.nextInt();
        System.out.println("Enter third coordinate ");
        int z = sc.nextInt();
        TwoDim b = new ThreeDim(x, y, z);
        System.out.println(" " + b);
    }
}
