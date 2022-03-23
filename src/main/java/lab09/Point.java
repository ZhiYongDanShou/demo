package lab09;

/**
 * @author shkstart
 * @create 2021-10-25 {TIME}
 */
public class Point {
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", s='" + s + '\'' +
                '}';
    }

    int x = 60, y = 80;
    private String s = "good";

    void move(int dy){
        y += dy;
    }

}

class Test{
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.toString());
    }
}