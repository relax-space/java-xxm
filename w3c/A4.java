
/**
 *  对象
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class A4 {

    public static class Fruit{
        String name, color;
        Float price;

        public Fruit() {
        }
        public Fruit(String n){
            name = n;
        }

        

        Float getPrice(){
            return price;
        }

    }
    public static void main(final String[] args) {
        Fruit f = new Fruit("apple");
        f.price=12.8f;
        System.out.println(f.name);
        System.out.println(f.getPrice());

    }
}