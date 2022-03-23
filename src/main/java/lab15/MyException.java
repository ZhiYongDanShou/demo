package lab15;

/**
 * @author shkstart
 * @create 2021-12-06 {TIME}
 */
public class MyException extends Exception{

    String message;
    public MyException(String ErrorMessage){
        message = ErrorMessage;
    }
    public String getMessage(){
        return message;
    }

}
