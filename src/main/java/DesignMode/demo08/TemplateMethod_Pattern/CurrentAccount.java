package main.java.DesignMode.demo08.TemplateMethod_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息!!!");
    }
}
