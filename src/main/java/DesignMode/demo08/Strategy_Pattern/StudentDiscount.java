package main.java.DesignMode.demo08.Strategy_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class StudentDiscount implements Discount{

    private final double DISCOUNT = 0.8;

    @Override
    public double calculate(double price) {
        System.out.println("学生票");
            return price * DISCOUNT;
    }
}
