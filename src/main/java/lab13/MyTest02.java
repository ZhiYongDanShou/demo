package lab13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-11-22 {TIME}
 */
public class MyTest02 {
    public static void main(String[] args) {
        List a1 = new ArrayList<>();
        a1.add(new Object());
        a1.add(new Integer(10));
        a1.add(new String("string"));
        System.out.println(a1.toString());

        List<Object> a2 = a1;
        a2.add(new Object());
        a2.add(new Integer(20));
        a2.add(new String("string2"));
        List<Object> aint = new ArrayList<>();
        List<Object> a22 = aint;
        System.out.println(a2.toString());

        List<Integer> a3 = a1;
        a3.add(new Integer(30));
//        a3.add((Integer) new Object());
//        a3.add(Integer.valueOf(new String("string3")));
        System.out.println(a3.toString());

        List<?> a4 = a1;
        a4.remove(0);
        a4.clear();
//        a4.add(new Object());
//        a4.add(new Integer(40));
//        a4.add(new String("string4"));
        System.out.println(a4.toString());

    }
}
