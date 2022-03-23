package software.lip;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class Customer extends BeijingShop {
    public void shopping(Shop shop){
        System.out.println(shop.sell());
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("各地特产");
        customer.shopping(new BeijingShop());
        customer.shopping(new LijiangShop());
        customer.shopping(new GuangzhouShop());
    }
}
interface Shop{
    public String sell();
}

class GuangzhouShop implements Shop{

    @Override
    public String sell() {
        return "广州塔冰箱贴";
    }
}

class LijiangShop implements Shop{

    @Override
    public String sell() {
        return "鲜花饼";
    }
}

class BeijingShop implements Shop{

    @Override
    public String sell() {
        return "长城冰箱贴";
    }
}