package lab10.Test;

/**
 * @author shkstart
 * @create 2021-11-01 {TIME}
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.toString());
    }
}

class Customer {
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                '}';
    }

    int id = 1001;
    String name;
    Account account;

    {
        name = "匿名客户";
    }

    public Customer(){
        account = new Account();
    }
}

class Account{}