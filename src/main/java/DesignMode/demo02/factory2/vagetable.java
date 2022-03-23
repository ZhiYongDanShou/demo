package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class vagetable implements SRfarm{
    public vagetable(){
        this.newPlant();
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
