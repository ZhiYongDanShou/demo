package main.java.DesignMode.demo07.State_Pattern;

/**
 * @author shkstart
 * @create 2022-04-14 {TIME}
 */
public class HighState extends AbstractState{
    public HighState(AbstractState state) {
        hj = state.hj;
        stateName = "优秀";
        score = state.score; }
    public void checkState() {
        if (score < 60) {
            hj.setState(new LowState(this));
        } else if (score < 90) {
            hj.setState(new MiddleState(this)); } }
}
