package main.java.DesignMode.demo04.Composite_Pattern;

/**
 * @author shkstart
 * @create 2022-03-24 {TIME}
 */
public class ShoppingTest {
    public static void main(String[] args) {
        float s= 0;
        Bags bag1,bag2,bag3,bag4;
        Goods g1,g2,g3,g4,g5,g6;
        bag1 = new Bags("红色小袋子" );
        bag2 = new Bags("白色小袋子");
        bag3 = new Bags("中袋子");
        bag4 = new Bags("大袋子");

        g1 = new Goods("婺源特产",2,7.9f);
        g2 = new Goods("婺源地图",1,9.9f);
        g3 = new Goods("韶关香菇",2,68);
        g4 = new Goods("韶关红茶",3,180);
        g5 = new Goods("景德镇瓷器",1,380);
        g6 = new Goods("李宁牌运动鞋",1,198);

        bag1.add(g1);
        bag1.add(g2);
        bag2.add(g3);
        bag2.add(g4);
        bag3.add(bag1);
        bag3.add(g5);
        bag4.add(bag3);
        bag4.add(bag2);
        bag4.add(g6);
//      显示李先生放在大袋子中的所以商品信息并计算要支付的总价
        bag4.show();
        bag4.calculation();

        s = bag4.calculation();
        System.out.println("支付总价为:" + s);
    }
}
