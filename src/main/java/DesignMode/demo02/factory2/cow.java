package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class cow implements SRfarm{
    public cow(){
        this.newAnimal();
    }
    @Override
    public void newAnimal() {
        System.out.println("养牛");
    }

    @Override
    public void newPlant() {
        System.out.println("种菜");
    }
}
