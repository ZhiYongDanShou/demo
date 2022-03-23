package main.java.DesignMode.demo04.Composite_Pattern;

/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public class Goods implements Aritcles {
    private String name;
    private int quantity;
    private float uniPrice;

    public Goods(String name, int quantity, float uniPrice) {
        this.name = name;
        this.quantity = quantity;
        this.uniPrice = uniPrice;
    }

    @Override
    public float calculation() {
        return quantity * uniPrice;
    }

    @Override
    public void show() {
        System.out.println("大袋子里的商品:" + name + "," + "价格为:" + quantity * uniPrice);
    }
}
