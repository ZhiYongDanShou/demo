package DesignMode.demo02.factory2;

/**
 * @author shkstart
 * @create 2022-03-09 {TIME}
 */
public class Client2 {
    public static void main(String[] args) {

        SGfarm sGfarm;
        FarmFactory farmFactory;
//        SGfarmFactory sGfarmFactory = new SGfarmFactory();
//        sGfarmFactory.sgfarm();
//        sGfarmFactory.srfarm();
        SRfarmFactory sRfarmFactory = new SRfarmFactory();
        sRfarmFactory.srfarm();
        sRfarmFactory.sgfarm();
    }

}
