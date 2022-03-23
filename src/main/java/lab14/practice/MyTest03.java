package lab14.practice;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//不带任何标签的continue：忽略本次循环剩下语句，加速循环；
public class MyTest03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
