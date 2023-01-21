
package practiceprograms;

//class MyException extends Exception{
//    public void except(){
//           System.out.println("EXCEPTION OCCURED!!!\nTRY AGAIN!!!");
//        }
//        
//    }

public class Exceptionss {
  public static void main(String args[]){
    try {
        int x = 9/3;
        System.out.println(x);
        throw new ArithmeticException("Div by 0");
        
    }
    catch(Exception e){
        System.out.println(e);
        }
}
}