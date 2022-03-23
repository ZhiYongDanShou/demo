package lab13;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2021-11-22 {TIME}
 */
public class MyTest {
    public static void main(String[] args) {
        Map<String ,String > map = new HashMap<>();
        map.put("01","李同学");
        map.put("02","魏同学");

//        System.out.println(map.keySet());
//        System.out.println(map.get(1));
//        System.out.println(map.get(2));
//        System.out.println(map.values());

        //获取map中的key集合同时以set形式输出
        Set<String> keySet = map.keySet();
        for (String key : keySet){
            String value = map.get(key);
            System.out.println("key集合中的元素:" + key);
        }
        for (String key : keySet){
            String value = map.get(key);
            System.out.println("values集合中的元素:" + value);
        }
    }
}
