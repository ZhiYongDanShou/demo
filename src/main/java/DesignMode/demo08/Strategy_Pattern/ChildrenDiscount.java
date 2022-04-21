package main.java.DesignMode.demo08.Strategy_Pattern;/**  
@author shkstart 
@create 2022-04-21 {TIME} 
    */
    public class ChildrenDiscount implements Discount{

    private final double DISCOUNT = 10;

    @Override
    public double calculate(double price) {
        System.out.println("儿童票");
        if (price >= 20) {
            return price - DISCOUNT;
        } else {
            return price;
        }
    }
}
