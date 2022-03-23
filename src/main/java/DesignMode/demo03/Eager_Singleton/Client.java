package DesignMode.demo03.Eager_Singleton;

/**
 * @author shkstart
 * @create 2022-03-17 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        Visitor v1,v2;
        v1 = Visitor.getVisit();
        v2 = Visitor.getVisit();
        int n = v2.getNumber();
        System.out.println("总的访问人数是:" + n);
        System.out.println(v1.toString());
        System.out.println(v2.toString());

    }
}
