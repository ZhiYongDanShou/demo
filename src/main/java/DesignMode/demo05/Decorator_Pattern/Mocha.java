package main.java.DesignMode.demo05.Decorator_Pattern;

/**
 * @author shkstart
 * @create 2022-03-31 {TIME}
 */
public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDecription(){
        super.getDecription();
        return "摩卡";
    }

    public double getCost(){
        super.getCost();
        return 10.0;
    }
}
