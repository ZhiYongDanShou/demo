package main.java.DesignMode.demo08.Strategy_Pattern;

/**
 * @author shkstart
 * @create 2022-04-21 {TIME}
 */
public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.calculate(this.price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
