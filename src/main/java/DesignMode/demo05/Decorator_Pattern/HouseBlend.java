package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 */
public class HouseBlend extends Beverage{

    @Override
    double getCost() {
        return 31.0;
    }

    @Override
    String getDecription() {
        return "混合咖啡(HouseBlend)";
    }

}
