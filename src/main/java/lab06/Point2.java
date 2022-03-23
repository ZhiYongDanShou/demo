package lab06;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class Point2 {
    static int x = 2;
}
class P2 extends Point2{
    static double x = 4.7;
    
    void printX(){
        System.out.println(x + "" + super.x);
    }
    public static void main(String[] args) {
        new P2().printX();
    }
}
