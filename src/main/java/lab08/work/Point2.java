package lab08.work;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
 class Point2 {
    int x, y;

    Point2(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Point2两个参数的函数");
    }
}

class ColorPoint2 extends Point2{
    static final int WHITE = 0, BLACK =1;
    int color;
    ColorPoint2(int x, int y){
        this(x,y,WHITE);
        System.out.println("ColorPoint两个参数的函数");
    }

    ColorPoint2(int x, int y,int color) {
        super(x, y);
        this.color = color;
        System.out.println("ColorPoint三个参数的函数");
    }
}

class Point2Test{
public static void main(String[]args){
    Point2 point2 =new ColorPoint2(0,1);
    System.out.println("");
//    System.out.println(point2.x);
//    System.out.println(point2.y);
//    System.out.println(ColorPoint3.WHITE);
//    System.out.println(ColorPoint3.BLACK);
}
}