package main.java.DesignMode.demo06.Iterator_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-04-07 {TIME}
 */
public abstract class AbstractObjectList {
    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    protected List<Object> objects = new ArrayList<Object>();

    public void addObject(Object obj){
        this.objects.add(obj);
    }

    public void removeObject(Object obj){
        this.objects.remove(obj);
    }

    public List<Object> getObjects() {
        return this.objects;
    }

    public abstract Abstractlterator createlterator();
}
