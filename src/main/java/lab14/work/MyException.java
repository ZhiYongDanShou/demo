package lab14.work;

/**
 * @author shkstart
 * @create 2021-11-29 {TIME}
 */

//创建自定义异常
public class MyException extends Exception  {
    public MyException(String ErrorMessage){
        super(ErrorMessage);
    }
}

class Tran{
    static int avg(int number1,int number2){
        if(number1<0 || number2<0){
            System.out.println("参数小于0");
        }
        if (number1>100 || number2>100){
            System.out.println("参数大于0");
        }
        return (number1+number2)/2 ;
    }

    public static void main(String[] args) throws MyException {
        System.out.println("平均值为:" + avg(34, 488));
        System.out.println("平均值为:" + avg(34, -8));
        System.out.println("平均值为:" + avg(24,24));
    }
}