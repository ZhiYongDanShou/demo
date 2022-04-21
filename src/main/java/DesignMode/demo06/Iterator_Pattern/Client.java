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
        products.add("苹果🍎");
        products.add("葡萄🍇");
        products.add("橙子🍊");
        products.add("菠萝🍍");
        products.add("胡萝卜🥕");

        AbstractObjectList list;
        Abstractlterator abstractlterator;


        list = new ProductList(products);
        abstractlterator = list.createlterator();

        System.out.println("正向遍历");
        while (!abstractlterator.isLast()){
            System.out.println(abstractlterator.getNextltem() + ",");
            abstractlterator.next();
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println("逆向遍历");
        while (!abstractlterator.isFirst()){
            System.out.println(abstractlterator.getPreviousItem() + ",");
            abstractlterator.previous();
        }
    }
}
