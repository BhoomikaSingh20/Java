
package practiceprograms;
import newpackage.*;

public class importPackage {
    public static void main(String args[]){
        packageClass1 pc1 = new packageClass1();
        packageClass2 pc2 = new packageClass2();
        packageClass3 pc3 = new packageClass3();
        
        pc1.morning();
        pc2.noon();
        pc3.night();
    }
}
