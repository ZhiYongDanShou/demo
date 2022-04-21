package main.java.DesignMode.demo08.Strategy_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class  VIPDiscount implements Discount{
    private final double DISCOUNT = 0.5;

    @Override
    public double calculate(double price) {
        System.out.println("VIP票");
        System.out.println("增加积分!");
        return price * DISCOUNT;
    }
}
