package main.java.DesignMode.demo04.Adapter_Pattern;


/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public class PoliceCarAdapter extends Carcontroller {
    //定义适配者对象
    private PoliceSound sound;
    private PloiceLamp lamp;

    //对适配者对象实例化
    public PoliceCarAdapter() {
      sound = new PoliceSound();
      lamp = new PloiceLamp();
    }

    @Override
    public void phonate() {
        sound.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
