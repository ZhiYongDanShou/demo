package lab06;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class Point4 {
    int x =2;
}
 class P4 extends Point4{
    double x =4.7;

    void printBoth(){
        System.out.println(x + "" + super.x);
    }

    public static void main(String[] args) {
        P4 sample = new P4();
        sample.printBoth();
        System.out.println(sample.x + "" + ((Point4)sample).x);
    }
}
