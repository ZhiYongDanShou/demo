package lab08.work;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */

public class Test04 {
    public static void main(String[] args) {
        W.change();
        System.out.println(W.a);
    }
}

class W{
    static int a = 10;
    public static  void change(){
        a++;
    }
}


//public class Test04 {
//    public static void main(String[] args) {
//        W w =new W();
//        w.change();
//        System.out.println(w.a);
//    }
//}
//
//class W{
//    int a = 10;
//    public  void change(){
//        a++;
//    }
//}
