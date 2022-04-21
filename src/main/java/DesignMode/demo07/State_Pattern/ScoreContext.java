package main.java.DesignMode.demo07.State_Pattern;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public class ScoreContext {
    private AbstractState state;
    ScoreContext() {
        state = new LowState(this); }
    public void setState(AbstractState state) {
        this.state = state; }
    public AbstractState getState() {
        return state; }
    public void add(int score) {
        state.addScore(score); }
}
