package BigWork.First;

/**
 * @author shkstart
 * @create 2021-10-19 {TIME}
 */
class Point {
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    int x, y;
    private Point(){
        reset();
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    void reset(){
        this.x = 0;
        this.y = 0;
    }
}
class ColoredPoint extends Point {
    int color;

    ColoredPoint(int x, int y) {
        super(x, y);
    }

    void clear(){
        reset();
    }
}

class Test{
    public static void main(String[] args) {
        ColoredPoint c = new ColoredPoint(0,0);
        c.reset();
        System.out.println(c.toString());

    }
}

//lab 06