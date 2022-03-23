package main.java.DesignMode.demo04.Composite_Pattern;

import java.util.ArrayList;

/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public class Bags implements Aritcles {
    private String name;
    private ArrayList<Aritcles> bags = new ArrayList<Aritcles>();

    public void add(Aritcles c) {
        bags.add(c);
    }

    public Bags(String name) {
        this.name = name;
    }

    public void remove(Aritcles c) {
        bags.remove(c);
    }

    public Aritcles getChild(int i) {
        return (Aritcles) bags.get(i);
    }


    @Override
    public float calculation() {
        float s=0;
        for(Object obj:bags)
        {
            s+=((Aritcles)obj).calculation();
        }
        return s;

    }

    @Override
    public void show() {
//        for循环bags集合
        for (Object obj : bags){
            ((Aritcles)obj).show();
        }
    }
}