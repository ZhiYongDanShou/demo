package DesignMode.demo02.factory_chouxiang;

/**
 * @author shkstart
 * @create 2022-03-10 {TIME}
 */
public class cow implements Animal{
    public cow(){
        this.newAnimal();
    }
    @Override
    public void newAnimal() {
        System.out.println("牛牛");
    }
}
