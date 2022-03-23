package lab04;

/**
 * @author shkstart
 * @create 2021-09-22 {TIME}
 */
public class LongIntegerCacheTest {
    public static void main(String[] args) {
        Long a = 127L;
        Long b = 127L;
        System.out.println("long max cached value is 127," + " and the result is:" + (a==b) );

        Long a1 = 128L;
        Long b1 = 128L;
        System.out.println("Long = 128 cache is " + (a1 == b1));

        Long c = 128L;
        Long d = 128L;
        System.out.println("Long min cached value is -128," + "and the result is:" + (c == d));


        Long c1 = -129L;
        Long d1 = -129L;
        System.out.println("Long = -129 cache is" + (c1 == d1));

        Long e = 1000L;
        Long f = 1000L;
        System.out.println("Long = 1000 is " + (e ==f));

        Integer x =1001;
        Integer y = 1001;
        System.out.println("Integer = 1001 is" + (x == y));



    }
}
