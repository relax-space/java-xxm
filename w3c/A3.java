
/**
 * 数组和集合,以及流程控制
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A3 {
    public static void main(final String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        System.out.println(list);
        list.set(0,"pear");
        System.out.println(list);

        System.out.println(list.get(0));

        list.add("banana");

        System.out.println("foreach start:================");
        for (String v : list) {
            if (v =="banana"){
                System.out.printf("if %s \n",v);
            }
            System.out.println(list.indexOf(v));
            System.out.println(v);
        }
        System.out.println("foreach end:================");

        String b =list.remove(0);
        System.out.println(b);
        System.out.println(list);


        System.out.println("================");
        System.out.println("================");


        Map<String,String> map  = new HashMap<String,String>();
        map.put("apple","red");
        map.put("pear", "green");
        System.out.println(map);

        map.put("apple","black");
        System.out.println(map);
        String ap = map.get("apple");
        System.out.println(ap);

        System.out.println("foreach start:================");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("foreach end:================");

        String dap = map.remove("pear");
        System.out.println(dap);
        System.out.println(map);

    }
}