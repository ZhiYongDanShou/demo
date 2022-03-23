package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class fruit implements SGfarm{
    public fruit(){
        this.newPlant();
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
