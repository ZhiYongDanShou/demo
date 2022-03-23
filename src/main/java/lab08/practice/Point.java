package lab08.practice;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
public class Point {
    float x, y;
    void move(int dx, int dy){
        x += dx;
        y += dy;
    }
    void move(float dx, float dy){
        x += dx;
        y += dy;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}

class PointTest{
    public static void main(String[] args) {
        Point point = new Point();
        point.move(1,4);
        point.move(4,9);
        System.out.println(point.x);
        System.out.println(point.y);
    }
}