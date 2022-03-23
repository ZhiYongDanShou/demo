package lab05;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
//        animal = new Cat();
//        animal.eat();
        Cat cat =new Cat();
        cat.eat();
        cat.leg=4;
        cat.climb();
    }
}
