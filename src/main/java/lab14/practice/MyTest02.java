package lab14.practice;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//带有给定标签的break：这个标签用于表示一个外层循环，
// 标签是一个后面紧跟着”;”的标识符。标签只有放在循环语句之前才有用；
public class MyTest02 {
    public static void main(String[] args) {
        outer:
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 2 ) {
                    break  outer;
                }
                System.out.println("j=" + j +";i=" + i);
            }
        }
    }
}
