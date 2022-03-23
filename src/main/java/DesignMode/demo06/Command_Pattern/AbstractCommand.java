package main.java.DesignMode.demo06.Command_Pattern;

/**
 * @author shkstart
 * @create 2022-04-06 {TIME}
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);
    public abstract int undo();
}
