import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class L1 {
    public static void main(final String[] args) {
        No1();
        No2(8);
    }

    public static void No1(){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 2000; i <= 3200; i++) {
            if (i %7 ==0 && i %5 !=0){
                intList.add(i);
            }
        }
        String joined = intList.stream().map(String::valueOf).collect(Collectors.joining(","));
        System.out.println(joined);
    }
    public static void No2(int input){
        Map<Integer, Integer> result = new HashMap<Integer,Integer>();
        for (int i = 1; i < input+1; i++) {
            result.put(i,i*i);
        }

        System.out.println(result);
    }
}