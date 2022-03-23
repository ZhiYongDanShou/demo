package main.java.DesignMode.demo04.Adapter_Pattern;

/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public abstract class Carcontroller {
    public void move() {
        System.out.println("汽车移动");
    }

    public abstract void phonate();

    public abstract void twinkle();
}
