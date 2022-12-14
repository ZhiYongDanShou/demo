package main.java.DesignMode.demo08.TemplateMethod_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public abstract class Account {
    public boolean validate(String account,String password){
        System.out.println("账号:" + account);
        System.out.println("密码:" + password);
        if (account.equalsIgnoreCase("林浩嘉") && password.equalsIgnoreCase("123456")){
            return true;
        }else {
            return false;
        }
    }
    public abstract void calculateInterest();
    public void display(){
        System.out.println("显示利息!!");
    }
    public void handle(String account,String password){
        if (!validate(account,password)){
            System.out.println("账号或密码错误!");
            return;
        }
        calculateInterest();
        display();
    }
}
