package lab08.work;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
public class Point3 {
    int x, y;

    Point3(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class ColorPoint3 extends Point3{
    static final int WHITE = 0, BLACK =1;
    int color;



    ColorPoint3(int x, int y){
        this(x,y,BLACK);
    }

    ColorPoint3(int x, int y,int color) {
        super(x, y);
        this.color = color;
    }
}

class Point3Test{
    public static void main(String[] args) {
        Point3 point3 = new ColorPoint3(5,1,ColorPoint3.BLACK);
        System.out.println(point3.x);
        System.out.println(point3.y);
        System.out.println(ColorPoint3.BLACK);
    }
}