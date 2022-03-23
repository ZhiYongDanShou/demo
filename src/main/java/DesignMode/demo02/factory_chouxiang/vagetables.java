package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class vagetables implements Plant{
    public vagetables(){
        this.newPlant();
    }
    @Override
    public void newPlant() {
        System.out.println("卷心菜");
    }
}
