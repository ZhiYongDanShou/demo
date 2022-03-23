package lab09;

import java.lang.reflect.Field;

/**
 * @author shkstart
 * @create 2021-10-25 {TIME}
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        //public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, ClassCastException
        //实例化对象
        Point point = new Point();
        //正常访问
        System.out.println(point.toString());
        //通过反射机制
        //获取反射类
        Class pointClass = lab09.Point.class;

        //获取字段x的变量
        Field field = pointClass.getDeclaredField("x");
        Field field2 = pointClass.getDeclaredField("s");

        //不能直接操作private属性,通过setAccessible关闭安全检测
        //IllegalAccessException异常:调用该类的构造方法，是Private访问权限。
        field.setAccessible(true);
        field2.setAccessible(true);

        //获取成员变量x的值
        //ClassCastException,强制转换或者时SQL映射时发生
        Object x = field.get(point);
        Object s = field.get(point);

        //通过反射修改成员变量x的值
        field.set(point,90);
        field2.set(point,"better");
        System.out.println(point.toString());

    }
}
