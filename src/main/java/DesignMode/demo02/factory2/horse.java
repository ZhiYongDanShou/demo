package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class horse implements SGfarm{
    public horse(){
        this.newAnimal();
    }

    @Override
    public void newAnimal() {
        System.out.println("养马🐎");
    }

    @Override
    public void newPlant() {
        System.out.println("种水果");
    }
}
