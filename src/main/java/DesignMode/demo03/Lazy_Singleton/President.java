package main.java.DesignMode.demo03.Lazy_Singleton;

/**
 * @author shkstart
 * @create 2022-03-17 {TIME}
 */
public class President {
    private static President instance = null;

    public President() {
    }

    public static synchronized President getInstance(){
        if (instance == null){
            instance = new President();
        }else {
            System.out.println("已经有一个总统,不能产生新总统!");
        }
        return instance;
    }

    public void getName(){
        System.out.println("林浩嘉");
    }
}
