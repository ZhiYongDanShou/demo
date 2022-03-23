package lab08.practice;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
 class Father {
    protected Number doSomething(int a,Integer b,Object c){
        System.out.println("Father's doSomething");
        return new Integer(7);
    }
}

class Son extends Father {
    protected Integer doSomething(int a, Integer b, Object c) {
        System.out.println("Son's doSomething");
        return new Integer(17);
    }
}

class MyTest{
    public static void main(String[] args) {
        Father father = new Son();
        father.doSomething(2,(Integer)2,(Object) 4);
        System.out.println("OK");
    }
}