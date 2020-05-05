import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class L1 {
    public static void main(final String[] args) {
        No1();
        No2(8);
        No4("AS21212sdfdsfs");
        No5();
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

    public static void No4(String raw){
        System.out.println(raw.toUpperCase());
    }

    public static void No5(){

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(String.format("%s*%s= %s ",i,j,i*j));
                if (j == i) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}