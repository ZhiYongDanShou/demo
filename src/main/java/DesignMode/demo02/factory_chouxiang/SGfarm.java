package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class SGfarm implements FarmFactory{
    @Override
    public Animal createAnimal() {
        return new horse();
    }

    @Override
    public Plant createPlant() {
        return new fruit();
    }
}
