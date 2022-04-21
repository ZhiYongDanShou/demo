package main.java.DesignMode.demo08.TemplateMethod_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class SavingAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息!!!");
    }
}
