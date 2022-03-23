package main.java.DesignMode.demo03.Prototype_Pattern;

/**
 * @author shkstart
 * @create 2022-03-17 {TIME}
 */
public class Citation implements Cloneable{
    private String name;
    private String info;

    public Citation() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
    }

//    public Object clone() throws CloneNotSupportedException {
////        Object clone = super.clone();
////        return clone();
//        return super.clone();
//    }

    public void display(){
        System.out.println("哈哈哈");
    }
    public Object clone() throws CloneNotSupportedException{
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
