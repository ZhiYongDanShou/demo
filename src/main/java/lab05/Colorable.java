package lab05;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public interface Colorable {
    void setColor(int color);
    int getColor();
}

enum Finish{
    MATTE, GLOSSY
}

 interface Paintable extends Colorable{
    void setFinish(Finish finish);
    Finish getFinish();
}

class Point1 {
   int x;
   int y;
}
class ColoredPoint extends Point implements Colorable {
    int color;

    public void setColor(int color) {
        this.color = color;
        System.out.println("setcolor");
    }

    public int getColor() {
        System.out.println("实现getcolor方法");
        return color;
    }

    @Override
    void alert() {

    }
}

    class PaintedPoint extends ColoredPoint implements Paintable{
        Finish finish;
        public void setFinish(Finish finish){
            this.finish = finish;
        }
        public Finish getFinish(){
            return finish;
        }

        public void getColor1(Colorable colorable){
            colorable.getColor();
        }
        public static void main(String[] args) {
            PaintedPoint paintedPoint = new PaintedPoint();
            ColoredPoint coloredPoint = new ColoredPoint();
            paintedPoint.getColor1(coloredPoint);
        }

        private static void paintedPoint(ColoredPoint coloredPoint) {
        }
    }

