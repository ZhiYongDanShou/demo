package lab07;

/**
 * @author shkstart
 * @create 2021-10-12 {TIME}
 */
abstract class Point {
    int x,y;
    public abstract String toString();
    protected String objString(){
        return super.toString();
    }
}

class ColoredPoint extends Point{
    int color;
    public String toString(){
        return objString() + ":color" + color;
    }

    public static void main(String[] args) {
         Point point = new Point() {
             @Override
             public String toString() {
                 return objString();
             }
         };
    }
}
