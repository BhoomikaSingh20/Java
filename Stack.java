
public class FixedStack extends Exception {
    private int stck[];
    private int tos;
    FixedStack(int size){ 
        stck = new int[size];
        tos = -1;
    }
    public void push(int item) throws Exception {
        if (tos == stck.length - 1) {
            throw new Exception("Stack is overflow.");
        } else {
            stck[++tos] = item;
            System.out.println("" + stck[tos]);
        }
    }
    public int pop() throws Exception {
        if (tos < 0) {
            throw new Exception("Stack underflow.");
        } else {
            System.out.println(stck[tos--]);
        }
        return 0;
    }
    public static void main(String[] args) throws Exception {
        FixedStack s = new FixedStack(5);
        FixedStack d = new FixedStack(5);
        try {
            for (int i = 0; i < 10; i++) {
                s.push(i);
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(d.pop());
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
    }
}
