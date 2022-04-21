package main.java.DesignMode.demo07.Observer_Pattern;


/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        AllyControlCenter acc;
        acc = new ConcreateAllyControlCenter("金庸群侠");

        Observer play1,play2,play3,play4,play5;

        play1 = new Player("杨过");
        acc.join(play1);
        play2 = new Player("令狐冲");
        acc.join(play2);
        play3 = new Player("张无忌");
        acc.join(play3);
        play4 = new Player("段誉");
        acc.join(play4);
        play5 = new Player("小龙女");
        acc.join(play5);
        play5.beAttacked(acc);

    }
}
