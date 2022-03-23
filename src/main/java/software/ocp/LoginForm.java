package software.ocp;

/**
 * @author shkstart
 * @create 2021-11-25 {TIME}
 */
public class LoginForm {
    private AbstractButton button = null;
    public  LoginForm(){
    }
    public void setButton(AbstractButton b){
        button = b;
    }
    public void display(){
        button.view();
    }
}
