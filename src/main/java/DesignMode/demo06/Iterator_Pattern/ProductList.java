package main.java.DesignMode.demo06.Iterator_Pattern;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-07 {TIME}
 */
public class ProductList extends AbstractObjectList{

    public ProductList(List<Object> products) {
        super(products);
    }

    public Abstractlterator createlterator(){
        return new Productlterator(this);
    }
}
