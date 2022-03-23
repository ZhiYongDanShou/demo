package lab07;

/**
 * @author shkstart
 * @create 2021-10-11 {TIME}
 */
public class StaticTest {
    public static void main(String[] args) {
        new R();
        new R();
    }
}

class P{
    static {
        System.out.println("static block-p");
    }
    public P(){
        System.out.println("P constructor");
    }
}

class Q extends P{
    static {
        System.out.println("static block-Q");
    }

    public Q(){
        System.out.println("Q constructor");
    }
}

class R extends Q{
    static {
        System.out.println("static block-R");
    }
    public R(){
        System.out.println("R contstructor");
    }
}