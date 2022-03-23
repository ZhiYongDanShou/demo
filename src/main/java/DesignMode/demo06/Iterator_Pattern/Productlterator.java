package main.java.DesignMode.demo06.Iterator_Pattern;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-07 {TIME}
 */
public class Productlterator implements Abstractlterator{
    private List<Object> products;
    private int cursor1;
    private int cursor2;

    public Productlterator(ProductList list) {
        this.products = list.getObjects();
        cursor1 = 0;
        cursor2 = products.size() - 1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1){
            cursor2--;
        }
    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNextltem() {
        return products.get(cursor1);
    }

    @Override
    public Object getPreviousItem() {
        return products.get(cursor2);
    }
}
