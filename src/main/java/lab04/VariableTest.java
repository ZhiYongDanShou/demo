package lab04;

/**
 * @author shkstart
 * @create 2021-09-22 {TIME}
 */
public class VariableTest {
    static int s;
    int i;
    int j;


    {
        int i = 1;
        i++;
        j++;
        s++;
            }

    public void test(int j) {
//        if (j <= 0) {
//            return -1;
//        } else {
//            long result = 1;
//            for (int i = j; i > 0; i++) {
//                result *= i;
//            }
//
//        }
        i++;
        j++;
        s++;
    }

    public static void main(String[] args) {
        VariableTest obj1 = new VariableTest();
        VariableTest obj2 = new VariableTest();
        obj1.test(10);
        obj2.test(20);
        obj2.test(30);
        System.out.println(obj1.i + "," + obj1.j + "," + obj1.s);
        System.out.println(obj2.i + "," + obj2.j + "," + obj2.s);
    }
}