package Test;

import lab04.Value;

/**
 * @author shkstart
 * @create 2021-09-25 {TIME}
 */
public class ValueTest {
        public static void main(String[] args) {
            int i1 = 3;
            int i2 = i1;
            i2 = 4;
            System.out.println("i1==" + i1);
            System.out.println("but i2==" + i2);
            Value v1 = new Value();
            v1.val= 5;
            Value v2 = new Value();
            v2.val=6;
            System.out.println("v1.val==" + v1.val);
            System.out.println("and v2.val==" + v2.val);
        }
}
