/**
 * 练习String.format
 * %s是通用的
 * 浮点型用%f
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class A2 {
    public static void main(final String[] args) {
        System.out.println(String.format("%s","大哥"));
        System.out.println(String.format("%s", 11));
        System.out.println(String.format("%.2f", 11.12212));
        System.out.println(String.format("%.2f", 11.12912));

        String t =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(t);
    }
}