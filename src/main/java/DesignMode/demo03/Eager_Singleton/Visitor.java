package DesignMode.demo03.Eager_Singleton;

/**
 * @author shkstart
 * @create 2022-03-17 {TIME}
 */
public class Visitor {
    private static Visitor Visit = new Visitor();
    private static int num = 0;

    private Visitor(){}

    public static Visitor getVisit(){
        num++;
        System.out.println("欢迎用户光临本站!");
        return Visit;
    }

    public int getNumber(){
        return Visitor.num;
    }
}
