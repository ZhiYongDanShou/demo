package lab08.practice;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
 class Father2 {
    protected void doSomething() {
        System.out.println("Father's doSomething");
    }
}

class Son2 extends Father2 {
    protected void doSomething() {
        System.out.println("Son's doSomething");
        super.doSomething();
    }
}

class MyTest2{
    public static void main(String[] args) {
        Father2 father2 = new Son2();
        father2.doSomething();
        System.out.println("OK");
    }
}