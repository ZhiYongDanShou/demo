package BigWork.First;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class Point3 {
    static int x = 2;
}

class P3 extends Point3 {
    static double x = 4.7;



    void printX(){
        System.out.println(x + "," + super.x);
    }
    public static void main(String[] args) {
        new P3().printX();
    }
}
//lab 06