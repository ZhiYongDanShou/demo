package lab06;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class Point {
    int x, y;
     Point(){
        reset();
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    void reset(){
        this.x = 0;
        this.y = 0;
    }
}
class ColoredPoint extends Point{
    int color;

    public ColoredPoint(int i, int j) {
    }

    void clear(){
        reset();
    }
}
class Test{
    public static void main(String[] args) {
        ColoredPoint coloredPoint = new ColoredPoint(5,8);
        coloredPoint.reset();
    }
}
