package main.java.DesignMode.demo06.Command_Pattern;

/**
 * @author shkstart
 * @create 2022-04-06 {TIME}
 */
public class AddCommand extends AbstractCommand{

    private Adder adder = new Adder();
    private int value;

    @Override
    public int execute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(- value);
    }
}
