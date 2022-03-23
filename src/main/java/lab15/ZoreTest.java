package lab15;

/**
 * @author shkstart
 * @create 2021-12-06 {TIME}
 */
public class ZoreTest {
    public static void main(String[] args) {
        try {
            int a = 100 / 0;
        } catch (Exception e) {
            System.out.println(e);
            throw new RuntimeException();
        } finally {
            System.out.println(1);
        }
        System.out.println(2);
    }
}
