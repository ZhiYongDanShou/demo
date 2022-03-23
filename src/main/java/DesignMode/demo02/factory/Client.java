package main.java.DesignMode.demo02.factory;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class Client {
    public static void main(String[] args) {
//        AimacreateFactory factory = new AimacreateFactory();
//        factory.createBike();
//        YadeacreateFactory factory1 = new YadeacreateFactory();
//        factory1.createBike();
        Bike bike;
        BikeFactory bikeFactory;
        AimacreateFactory factory = new AimacreateFactory();
        factory.createBike();
    }
}
