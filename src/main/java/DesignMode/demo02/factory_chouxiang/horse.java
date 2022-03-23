package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class horse implements Animal{
    public horse(){
        this.newAnimal();
    }
    @Override
    public void newAnimal() {
        System.out.println("马儿");
    }
}
