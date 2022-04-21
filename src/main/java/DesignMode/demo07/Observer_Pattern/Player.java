package main.java.DesignMode.demo07.Observer_Pattern;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public class Player implements Observer{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住," + this.name + "来救你!");
    }

    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击!");
        acc.notifyObserver(name);
    }
}
