package lab12;

/**
 * @author shkstart
 * @create 2021-11-15 {TIME}
 */
public class MyTest05 {
    public static void main(String[] args) {
        int[][] a = {{3,1,4,2,5},{4,2}};
        int[][] b = new int[a.length][a.length];
        //循环进行克隆
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i].clone();
        }

        b[0][0] = 6666;
        System.out.println(a == b);
        System.out.println(b[0] == a[0]);
        System.out.println(b[0][0] == a[0][0]);
        System.out.println(a[0][0]);
        System.out.println(b[0][0]);
    }
}
