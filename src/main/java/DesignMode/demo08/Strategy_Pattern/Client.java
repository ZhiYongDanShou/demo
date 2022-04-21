package main.java.DesignMode.demo08.Strategy_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrive = 60.0;
        double currentPrice;

        movieTicket.setPrice(originalPrive);
        System.out.println("原始价格为:" + originalPrive );
        System.out.println("---------==========----------");

        Discount discount ;
        discount = (Discount)XMLUtil.getBean();
        movieTicket.setDiscount(discount);

        currentPrice = movieTicket.getPrice();
        System.out.println("折扣后的价格为:" + currentPrice);
    }
}
