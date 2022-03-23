package Test;

/**
 * @author shkstart
 * @create 2021-09-11 {TIME}
 */
public class Test2 {
    static void print(String a, String b, String c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        String s = "going";
        print(s,s,s = "gone");
    }
}
