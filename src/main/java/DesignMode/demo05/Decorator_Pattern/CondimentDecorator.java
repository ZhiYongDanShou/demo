package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 * 抽象装饰类
 */
public class CondimentDecorator extends  Beverage{

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double getCost() {
        return beverage.getCost();
    }

    @Override
    String getDecription() {
        return beverage.getDecription();
    }

}
