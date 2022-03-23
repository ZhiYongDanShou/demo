package lab14.practice;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//带有给定标签的continue：直接跳到目标标签所标识标号语句
public class MyTest04 {
    public static void main(String[] args) {
        outer:
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                if (i == 2){
                    continue outer;
                }
                System.out.println("j=" + j + ";i=" + i);
            }
        }
    }
}
