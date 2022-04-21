package main.java.DesignMode.demo08.TemplateMethod_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class Client{
    public static void main(String[] args) {
        Account account;
        account = (Account)XMLUtil.getBean();
        account.handle("林浩嘉","123456");
    }
}
