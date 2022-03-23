package Test;

/**
 * @author shkstart
 * @create 2021-09-11 {TIME}
 */
public class TooMany {
    static void howMany(int k){
        switch (k){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("too");
                break;
            case 3:
                System.out.println("many");
                break;
        }
    }

    public static void main(String[] args) {
        howMany(3);
        howMany(2);
        howMany(1);
    }
}
