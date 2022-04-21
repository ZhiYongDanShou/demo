package main.java.DesignMode.demo07.Observer_Pattern;


import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public abstract class AllyControlCenter {
    protected String allName;
    protected ArrayList<Observer> players = new ArrayList<Observer>();


    public String getAllyName() {
        return this.allName;
    }

    public void setAllyName(String allyName) {
        this.allName = allName;
    }

    public void join(Observer obs){
        System.out.println(obs.getName() + "加入" + this.allName + "战队!");
        players.add(obs);
    }

    public void quit(Observer obs){
        System.out.println(obs.getName() + "退出" + this.allName + "战队!");
        players.remove(obs);
    }

    public abstract void notifyObserver(String name);
}
