package main.java.DesignMode.demo07.State_Pattern;

/**
 * @author shkstart
 * @create 2022-04-16 {TIME}
 */
public class ScoreStateTest {
    public static void main(String[] args) {
        ScoreContext account = new ScoreContext();
        System.out.println("学生成绩状态测试：");
        account.add(30);
        account.add(40);
        account.add(25);
        account.add(-15);
        account.add(-25); }
}
