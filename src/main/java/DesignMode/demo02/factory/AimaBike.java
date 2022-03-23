package main.java.DesignMode.demo02.factory;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class AimaBike implements Bike {
    public AimaBike(){
        this.makeBike();
    }

    @Override
    public void makeBike() {
        System.out.println("Aima电动自行车 good");
    }
}
