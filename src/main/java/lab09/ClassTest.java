package lab09;

import java.lang.reflect.Field;

/**
 * @author shkstart
 * @create 2021-10-25 {TIME}
 */
public class ClassTest {
    //数组类型有一个魔法属性,通过length获取数组长度
    private static int[] array1 = new int[3];
    private static int length1 = array1.length;

    //任何小写class定义类,也有一个魔法属性:class,来获取类的大写Class类对象
    private static Class<One> one = One.class;
    private static Class<Another> another = Another.class;

    public static void main(String[] args) throws Exception {
        //通过newInstance()来创建类对象
        One oneObject = one.newInstance();
        oneObject.call();
        Another anotherObject = another.newInstance();
        anotherObject.speak();

        //通过One这个大写的Class对象,获取私有成员属性对象Field
        Field privateFieldInOne = one.getDeclaredField("inner");

        //设置私有对象可以访问修改
        privateFieldInOne.setAccessible(true);
        privateFieldInOne.set(oneObject,"world changed.");
        System.out.println(oneObject.getInner());
    }
};

class One{
    private String inner = "timer files.";

    public void call(){
        System.out.println("hello world.");
    }

    public String getInner(){
        return inner;
    }
}

class Another{
    public void speak(){
        System.out.println("easy coding.");
    }
}


