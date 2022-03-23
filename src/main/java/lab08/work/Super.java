package lab08.work;

/**
 * @author shkstart
 * @create 2021-10-18 {TIME}
 */
 class Super {
    static  String greeting(){
        return "Goodnight";
    }
    String name(){
        return "Richard";
    }
}

class Sub extends Super{
    static String greeting(){
        return "Hello";
    }
    String name(){
        return "Dick";
    }
}

class MyTest{
    public static void main(String[] args) {
        Super s = new Sub();
        System.out.println(s.greeting() + "," + s.name());

    }

}
