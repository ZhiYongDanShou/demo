package lab06;

/**
 * @author shkstart
 * @create 2021-10-09 {TIME}
 */
public class OuterClass {
    InnerClass innerClass = new InnerClass();
    private int i = 0;
    private void read(){
        i++;
    }

    class InnerClass {
        int j = 5;
        void run(){
            read();
            j++;
            System.out.println(i + "," +j);
        }
    }
    private void draw(){
        int j = 8;
        System.out.println(j);
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.i);
        innerClass.run();
        outerClass.draw();
        System.out.println(outerClass.i);
    }
}
