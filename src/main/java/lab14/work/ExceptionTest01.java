package lab14.work;

/**
 * @author shkstart
 * @create 2021-11-30 {TIME}
 */
public class ExceptionTest01 {

    public void runtimeExceptionNotUserTryCatch(){
        String str = null;
        m1(str);
        System.out.println("over");
    }

    //异常
    public void m1(String str){
//        int i = str.indexOf("111");
        if (str == null){
            System.out.println("空指针异常");
        }else {
            int i = str.indexOf("111");
        }
    }

}
