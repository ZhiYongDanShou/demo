package main.java.DesignMode.demo06.Command_Pattern;

/**
 * @author shkstart
 * @create 2022-04-06 {TIME}
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new AddCommand();
        form.setCommand(command);
        form.compute(100);
        form.compute(50);
        form.compute(100);
        form.undo(); }}
