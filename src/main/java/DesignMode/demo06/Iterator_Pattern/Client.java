package main.java.DesignMode.demo06.Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-07 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        List<Object> products = new ArrayList<>();
        products.add("čšćđ");
        products.add("čĄčđ");
        products.add("ćŠĺ­đ");
        products.add("č čđ");
        products.add("čĄčĺđĽ");

        AbstractObjectList list;
        Abstractlterator abstractlterator;


        list = new ProductList(products);
        abstractlterator = list.createlterator();

        System.out.println("ć­Łĺéĺ");
        while (!abstractlterator.isLast()){
            System.out.println(abstractlterator.getNextltem() + ",");
            abstractlterator.next();
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println("éĺéĺ");
        while (!abstractlterator.isFirst()){
            System.out.println(abstractlterator.getPreviousItem() + ",");
            abstractlterator.previous();
        }
    }
}
