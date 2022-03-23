package BigWork.First;

/**
 * @author shkstart
 * @create 2021-10-19 {TIME}
 */
abstract class Point4 {
    int x = 1, y = 1;

    void move(int dx, int dy) {
        x += dx;
        y += dy;
        alert();
    }

    abstract void alert();

    abstract static class ColoredPoint1 extends Point4 {
        int color ;
    }

    static class SimplePoint extends Point4 {

        @Override
        void alert() {
        }
    }

    public static class PointTest {
        public static void main(String[] args) {
            Point4 p1 = new SimplePoint();
//            SimplePoint p2 = new SimplePoint();
            System.out.println(p1.x + p1.y);

        }
    }

}
//lab05