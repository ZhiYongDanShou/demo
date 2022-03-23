package lab10.Test;

/**
 * @author shkstart
 * @create 2021-11-01 {TIME}
 */
public class MyTest03 {
    private final int a = 10;
    private final int b = 10;
    private float c = 11f;
    private float d = 11f;
    private float e = 11f;

    public int sum(){
        int sum;
        sum = a + b;
        return sum;
    }
    @Override
    public String toString() {
        return "MyTest02{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", e=" + e +
                '}';
    }

    public static void main(String[] args) {
        MyTest03 test02 = new MyTest03();
        System.out.println(test02.toString());
        System.out.println(test02.sum());
    }
}
