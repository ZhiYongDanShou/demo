package Test;

/**
 * @author shkstart
 * @create 2021-09-11 {TIME}
 */
public class Test1 {
    public static void main(String[] args) {
        int i = 2;
        int a = 9;
        a += (a = 3);
        int j = (i = 3) * i;
        System.out.println(j);
    }
}
