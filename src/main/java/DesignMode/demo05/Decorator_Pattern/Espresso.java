package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 */
public class Espresso extends Beverage{
    @Override
    double getCost() {
        return 25.0;
    }

    @Override
    String getDecription() {
        return "浓缩咖啡(Espresso)";
    }
}
