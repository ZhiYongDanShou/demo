package BigWork.Final2;

//声明Utensil类
class Utensil{
    public Utensil() {
        System.out.println("Utensil constructor");
    }
}

//Spoon类继承Utensil类
class Spoon extends Utensil{
    public Spoon(){
        super();
        System.out.println("Spoon constructor");
    }
}

//Fork类继承Utensil类
class Fork extends Utensil {
    public Fork(){
        super();
        System.out.println("Fork constructor");
    }
}

//Knife类继承Utensil类
class Knife extends Utensil {
    public Knife(){
        super();
        System.out.println("Knife constructor");
    }
}

//声明Plate类
class Plate {
    public Plate(){
        System.out.println("Plate constructor");
    }
}
//Knife类继承Plate类
class DinnerPlate extends Plate {
    public DinnerPlate(){
        super();
        System.out.println("DinnerPlate constructor");
    }
}

//声明Custom类,并声明无参构造
class Custom {
    public Custom(){
        System.out.println("Custom constructor");
    }
}

//餐桌的布置,继承Custom类
class PlaceSetting extends Custom {
    Spoon sp;
    Fork frk;
    Knife kn;
    DinnerPlate pl; // 布置餐桌需要各种餐盘餐具的组合,它的组件有勺子、叉子、餐刀、餐盘

    public PlaceSetting(){
        super();  //调用超类的构造方法
        // 调用组件所属类的构造方法
        sp = new Spoon();
        frk = new Fork();
        kn = new Knife();
        pl = new DinnerPlate();
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args){
        //实例化对象
        PlaceSetting x = new PlaceSetting();
    }
}
