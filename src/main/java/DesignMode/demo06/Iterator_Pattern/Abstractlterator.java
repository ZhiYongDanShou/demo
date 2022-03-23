package main.java.DesignMode.demo06.Iterator_Pattern;

/**
 * @author shkstart
 * @create 2022-04-07 {TIME}
 */
public interface Abstractlterator {
    public void next();

    public boolean isLast();

    public void previous();

    public boolean isFirst();

    public Object getNextltem();

    public Object getPreviousItem();
}
