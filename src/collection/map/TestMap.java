package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Map集合的四种遍历方式
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab");
        System.out.println(map.size());
        // 第一种：
        System.out.println("第一种：通过Map.keySet遍历key和value：");
        for (Integer i : map.keySet()){
            String s = map.get(i);
            System.out.println(i + " : " + s);
        }
        //第二种
        System.out.println("第二种：通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        //第三种
        System.out.println("第三种：通过Map.entrySet遍历key和value:");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        }
        //第四种
        System.out.println("第四种：通过Map.values()遍历所有的value，但不能遍历key:");
        for (String s : map.values()){
            System.out.println("value = " + s);
        }
    }
}
