package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class SRfarmFactory implements FarmFactory{
    @Override
    public fruit sgfarm() {
        return new fruit();
    }

    @Override
    public horse srfarm() {
        return new horse();
    }
}
