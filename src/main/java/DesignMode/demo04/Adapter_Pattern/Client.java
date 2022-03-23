package main.java.DesignMode.demo04.Adapter_Pattern;

/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        PoliceCarAdapter policeCarAdapter = new PoliceCarAdapter();
        policeCarAdapter.move();
        policeCarAdapter.phonate();
        policeCarAdapter.twinkle();

    }
}
