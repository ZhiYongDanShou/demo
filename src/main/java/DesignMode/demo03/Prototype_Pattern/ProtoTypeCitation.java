package main.java.DesignMode.demo03.Prototype_Pattern;

/**
 * @author shkstart
 * @create 2022-03-17 {TIME}
 */
public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation obj1;
        obj1 = new Citation();
        obj1.setName("林浩嘉");
        obj1.setInfo("1940129502");
        obj1.setCollege("广州软件学院");
        obj1.display();
        Citation obj2 = (Citation) obj1.clone();
        System.out.println("三好学生:" + obj1.getName() +"\t" + obj1.getInfo() +"\t" + obj1.getCollege() );

    }
}
