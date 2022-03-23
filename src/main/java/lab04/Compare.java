package lab04;

/**
 * @author shkstart
 * @create 2021-09-25 {TIME}
 */
public class Compare {
    public static void main(String[] args) {
        double da1 = 0.9999999;
        double da2=0.3333333*3;
        double THRESHOLD = 0.000000001;
        System.out.println(da1 == da2);
        System.out.println(Math.abs(da1 - da2) <= THRESHOLD);
    }
}
