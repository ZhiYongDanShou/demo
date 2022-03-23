package lab15;

/**
 * @author shkstart
 * @create 2021-12-12 {TIME}
 */
class HightAgeException extends Exception { // 年龄高异常
    private String s;

    public HightAgeException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class LowAgeException extends Exception { // 年龄底异常
    private String s;

    public LowAgeException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class HightSalaryException extends Exception { // 工资高异常
    private String s;

    public HightSalaryException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class LowSalaryException extends Exception { // 工资低异常
    private String s;

    public LowSalaryException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class IDcardException extends Exception { // 身份证异常
    private String s;

    public IDcardException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class NullException extends Exception { // 空异常
    private String s;

    public NullException(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}

class Employee {
    private int id; // 编号
    private String name; // 姓名
    private int age; // 年龄
    private double salary; // 工资
    private String idCard; // 身份证号
    private int totalEmployee = 10; // 人数
    private double totalSalary = 100000; // 总工资

    //2、在你的方法里抛出定义具体的检查性异常
    public Employee(int id, int age, String name) throws Exception {

        if (age < 18) {
            throw new LowAgeException("年龄太小了！");
        } else if (age > 60) {
            throw new HightAgeException("年龄太大了！");
        } else if (name == null || name == "") {
            throw new NullException("输入名字不合法！");
        }
    }

    public Employee(double salary, String idCard) throws Exception {
        if (salary < 600) {
            throw new LowSalaryException("工资低了！");
        }else {
            throw new HightSalaryException("工资过高");
        }
        /**
         *1、完成代码语句，如果工资高于totalSalary，则抛出HightSalaryException
         *
         */
    }


    public static class TestExceptionEmyoeer {

        public static void main(String[] args) {
            /**
             *3、参考以下代码，设计对象，用户输入不同内容或者通过构造方法设计，使得程序分别抛出空异常、身份证异常、工资低异常、工资高异常、年龄底异常、
             *年龄高异常，并给出相应输出结果。
             *
             */

            try {
                Employee employee = new Employee(400, "123456");
            } catch (LowSalaryException e) {
                System.out.println(e.getS());
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}