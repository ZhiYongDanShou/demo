package main.java.DesignMode.demo02.factory;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class YadeaBike implements Bike{
    public YadeaBike(){
        this.makeBike();
    }
    @Override
    public void makeBike() {
        System.out.println("Yadea电动自行车 good");
    }
}
