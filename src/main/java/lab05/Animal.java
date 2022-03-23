package lab05;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class Animal {
    void eat(){
        System.out.println("吃......");
    }
}
class  Cat extends Animal{
    int leg;
    void eat(){
        System.out.println("喜欢吃鱼");
    }

    void climb(){
        System.out.println("喜欢爬");
    }
}

