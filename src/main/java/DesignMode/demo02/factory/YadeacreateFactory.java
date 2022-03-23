package main.java.DesignMode.demo02.factory;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class YadeacreateFactory implements BikeFactory{
    @Override
    public Bike createBike() {
        System.out.println("Yadea自行车生产了");

        return new YadeaBike();
    }
}
