package main.java.DesignMode.demo07.Observer_Pattern;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public class ConcreateAllyControlCenter extends AllyControlCenter{
    public ConcreateAllyControlCenter(String allName) {
        System.out.println(allName + "战队组建成功!");
        System.out.println("------------");
        this.allName = allName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allName+"战队紧急通知,盟友" + name + "遭受敌人攻击!");
        for (Object obs : players){
            if (!((Observer)obs).getName().equalsIgnoreCase(name)){
                ((Observer)obs).help();
            }
        }
    }
}
