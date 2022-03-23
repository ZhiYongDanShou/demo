package lab15;

/**
 * @author shkstart
 * @create 2021-12-06 {TIME}
 */
public class MyTest {
    static void blowUp() throws BlewIt{
        throw new NullPointerException();
    }

    public static void main(String[] args) throws BlewIt {
        try {
            blowUp();
        } catch (BlewIt e) {
            System.out.println("Caught BlewIt");
        } finally{
            System.out.println("UnCaught Exception ");
        }
    }
}

class BlewIt extends Exception{
    BlewIt() {}

    public BlewIt(String s) {
        super(s);
    }
}