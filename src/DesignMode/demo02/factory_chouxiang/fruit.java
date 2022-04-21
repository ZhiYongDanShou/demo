package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class fruit implements Plant{
    public fruit(){
        this.newPlant();
    }
    @Override
    public void newPlant() {
        System.out.println("水果哦");
    }
}
