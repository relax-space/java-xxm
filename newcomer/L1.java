import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class L1 {
    public static void main(final String[] args) {
        System.out.println(No1());
    }

    public static String No1(){
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 2000; i <= 3200; i++) {
            if (i %7 ==0 && i %5 !=0){
                intList.add(i);
            }
        }
        String joined = intList.stream().map(String::valueOf).collect(Collectors.joining(","));
        return joined;
    }
}