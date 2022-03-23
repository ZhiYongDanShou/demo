package lab07;

/**
 * @author shkstart
 * @create 2021-10-11 {TIME}
 */
public class ClassTest {
    private int a;
    private String s1;
    private static  String s = "final";


    public ClassTest(){
        System.out.println("调用父类无参构造方法");
    }
//    重载带参数的构造方法,要求传入参数a,并为a赋值,输出提示"调用重载带参数的构造方法"和a的值
    public ClassTest(int a){
        this.a = a;
    }


    //类方法(静态方法)
    public static void staticMethod(){
        System.out.println("调用父类static方法(类方法)");
    }

//    重载类的方法staticMethod,传入字符串s,并输出s的值,亲测类的方法是否可以被重载
    public void staticMethod (String s1){
        s1="Hello";
        System.out.println("输出s的值:" + s1);

    }

//    final方法
    public final void finalMethod(){
        String s;
        System.out.println("调用父类final方法");
    }

//    重载类的方法finalMethod,传入字符串s,并输出s的值,亲测类final方法是否可以被重载
    public final void finalMethod(String s){
        System.out.println("输出s的值:" + s);
    }

    public static void main(String[] args) {

        ClassTest classTest = new ClassTest();
        classTest.a = 666;
        System.out.println("调用重载带参数的构造方法," + "赋值a并输出:" + classTest.a);
        classTest.staticMethod();
        classTest.staticMethod(s);
        classTest.finalMethod();
        classTest.finalMethod(s);

    }
}
