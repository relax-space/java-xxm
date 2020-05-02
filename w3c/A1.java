
/**
 * 练习java变量的定义
 */
public class A1 {
    private static  int d;
    public static void main(final String[] args) {
        int a = 12;
        String b = "hello";
        System.out.println(a);
        System.out.println(b);

        final int c =14;
        System.out.println(c);

        d =15;
        System.out.println(d);
    }
}