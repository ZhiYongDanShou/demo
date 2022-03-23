package lab05;

/**
 * @author shkstart
 * @create 2021-10-07 {TIME}
 */
public abstract class Point {
    int x = 1, y =1;
    void move(int dx, int dy){
        x += dx;
        y += dy;
        alert();
    }
    abstract void alert();

abstract static class ColoredPoint1 extends Point{
    int color;
}
static class SimplePoint extends Point{
    void alert(){}
}
public static class PointTest{
    public static void main(String[] args) {
        Point p = new Point() {
            @Override
            void alert() {
            }
        };
        Point p2 = new ColoredPoint1() {
            @Override
            void alert() {
            }
        };
        Point p1 = new SimplePoint();
        System.out.println(p.x);
        System.out.println(p.y);
            }
        }
}
//    }}
//}


