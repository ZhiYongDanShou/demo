package lab14.practice;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//不带标签的break语句：强行终止循环，用于完全结束一个循环
public class MyTest01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2){
                break;
            }
            System.out.println("i=" + i);
        }
    }
}
