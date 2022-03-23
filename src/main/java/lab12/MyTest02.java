package lab12;

/**
 * @author shkstart
 * @create 2021-11-15 {TIME}
 */
public class MyTest02 {
    public static void main(String[] args) {
        int[][] ia1 = {{1,2},null};
        int[][] ia2 = ia1.clone();
        System.out.println("ia1==ia2:" + (ia1 == ia2));
        System.out.println(ia1[0] == ia2[0] && ia1[1] == ia2[1]);
    }
}
