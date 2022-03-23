package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDecription(){
        super.getDecription();
        return "牛奶";
    }

    public double getCost(){
        super.getCost();
        return 6.0;
    }
}
