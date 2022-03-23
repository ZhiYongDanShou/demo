package BigWork.Final;

/**
 * @author shkstart
 * @create 2021-10-19 {TIME}
 */
public class PlaceSetting extends Custom {

    public  PlaceSetting(){
        System.out.println("Utensil constructor");
    }

    @Override
    public void sp(){
        super.sp();
        System.out.println("Utensil constructor");
    }

    @Override
    public void Fork(){
        super.Fork();
        System.out.println("Utensil constructor");
    }

    @Override
    public void Knife(){
        super.Knife();
        System.out.println("Utensil constructor");
    }

    @Override
    public void DinnerPlate(){
        super.DinnerPlate();
    }

    public void test(){
        sp();
        Fork();
        Knife();
        DinnerPlate();
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting();
        x.test();
    }
}
