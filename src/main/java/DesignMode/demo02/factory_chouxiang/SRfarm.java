package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class SRfarm implements FarmFactory{
    @Override
    public Animal createAnimal() {
        return new cow();
    }

    @Override
    public Plant createPlant() {
        return new vagetables();
    }
}
