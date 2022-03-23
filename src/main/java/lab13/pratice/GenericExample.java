package lab13.pratice;

/**
 * @author shkstart
 * @create 2021-11-23 {TIME}
 */

import java.util.ArrayList;
import java.util.List;

public class GenericExample{
    public void testGeneric(){//泛型
        List<String> strList = new ArrayList<String>();
        strList.add("Rose");
        strList.add("Jack");
        strList.add("365");
        for(int i=0; i<strList.size(); i++){
            String Name_1 = strList.get(i);
            System.out.println("Name is:"+Name_1);
        }
    }
    public static void main(String[] args){
        GenericExample ge = new GenericExample();
        ge.testGeneric();
    }
}
