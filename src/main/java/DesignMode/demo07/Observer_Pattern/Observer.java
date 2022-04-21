package main.java.DesignMode.demo07.Observer_Pattern;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public interface Observer {
    public String getName();
    public void setName(String name);
    public void help();
    public void beAttacked(AllyControlCenter acc);
}
