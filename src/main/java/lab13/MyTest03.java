package lab13;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2021-11-23 {TIME}
 */
public class MyTest03 {
    public static void main(String[] args) {
        //第一段
        List<Animal> animals = new ArrayList<Animal>();
        List<Cat> cats = new ArrayList<>();
        List<Garfield> garfields = new ArrayList<>();
        animals.add(new Animal());
        cats.add(new Cat());
        garfields.add(new Garfield());

        //第二段
//        List<? extends  Cat> extendsCatFromAnimal = animals;
        List<? super   Cat> superCatFromAnimal = animals;
        List<? extends  Cat> extendsCatFromCat = cats;
        List<? super   Cat> superCatFromCat = cats;
        List<? extends  Cat> extendsCatFromGarfield = garfields;
//        List<? super   Cat> superCatFromGarfield  = garfields;


        //第三段
//        extendsCatFromCat.add(new Animal());
//        extendsCatFromCat.add(new Cat());
//        extendsCatFromCat.add(new Garfield());
//        superCatFromCat.add(new Animal());
        superCatFromCat.add(new Cat());
        superCatFromCat.add(new Garfield());

        //第四段
//        Object object1 = superCatFromCat.get(0);
//        Animal object = superCatFromCat.get(0);
//        Cat object3 = superCatFromCat.get(0);

        Animal catExtends3 = extendsCatFromCat.get(0);
        Object catExtends2 = extendsCatFromCat.get(0);
        Cat catExtends1 = extendsCatFromCat.get(0);

//        Garfield cat2 = extendsCatFromGarfield.get(0);
    }
}

class Animal{}
class Cat extends Animal{}
class Garfield extends Cat{}