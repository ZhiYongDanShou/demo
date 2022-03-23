package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class Person {
    public static void main(String[] args) {
        FarmFactory factory;
        Animal animal;
        Plant plant;
        factory = (FarmFactory) XMLUtil.getBean();
        animal = factory.createAnimal();
        plant = factory.createPlant();
    }
}
