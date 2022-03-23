package lab14.practice;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//return：用来结束一个方法，当一个方法执行到return语句时，这个方法将被结束。
public class MyTest05 {
    int add(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        MyTest05 myTest05 = new MyTest05();
        System.out.println(myTest05.add(2,4));
    }
}
//
//class BCRTest{
//    int add(int a,int b){
//        int sum = a + b;
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        MyTest05 myTest05 = new MyTest05();
//        myTest05.add(2,4);
//    }
//}
