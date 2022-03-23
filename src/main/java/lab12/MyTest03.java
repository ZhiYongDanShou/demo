package lab12;

/**
 * @author shkstart
 * @create 2021-11-15 {TIME}
 */
public class MyTest03 {
    public static void main(String[] args) {
        int[] ia = new int[3];
        System.out.println(ia.getClass());
        System.out.println(ia.getClass().getSuperclass());
        for (Class<?> c : ia.getClass().getInterfaces())
            System.out.println("Superinterface:" + c);
    }
}
