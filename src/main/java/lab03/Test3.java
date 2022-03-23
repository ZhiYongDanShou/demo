package lab03;

/**
 * @author shkstart
 * @create 2021-09-17 {TIME}
 */
public class Test3 {
    public static void main(String[] args) {
        double d = 1e308;
        System.out.println("overflow produces inifinity:");
        System.out.println(d + "* 10==" + d * 10);
        d = 1e-305 * Math.PI;
        System.out.println("gradual underflow:" + d + "\n");
        for (int i = 0; i < 4; i++)
            System.out.println("" + (d /= 100000));
        System.out.println();
        System.out.println("0.0/0.0 is Not-a-Number:");
        d = 0.0 / 0.0;
        System.out.println(d);
        System.out.println("inexact results and rounding:");
        for (int i = 0; i < 100; i++){
            float z = 1.0f / i;
            if (z * i != 1.0f)
                System.out.println("" + i);
        }
        System.out.println();
        System.out.println("inexact results with double:");
        for (int i = 0; i < 100; i++){
            double z = 1.0 / i;
            if (z * i != 1.0){
                System.out.println("" + i);
            }
            System.out.println();
            System.out.println("cast to int rounds toward 0:");
            d = 12395.6;
            System.out.println((int) d + "" + (int) (-d));
        }
    }
}
