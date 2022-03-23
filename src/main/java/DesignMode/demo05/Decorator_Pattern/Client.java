package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        String decription;
        double cost;
        Beverage beverage;
        Beverage condimentDecorator,milk,mocha,condimentDecorator2;
        condimentDecorator = new Espresso();
        condimentDecorator2 = new HouseBlend();
        milk =new Milk(condimentDecorator);
        mocha =new Milk(condimentDecorator);
        mocha.getDecription();
        mocha.getCost();
    }
}
