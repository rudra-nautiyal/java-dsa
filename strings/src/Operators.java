import java.sql.Array;
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("Kunal" + new ArrayList<>());
        System.out.println("Rudra" + new Integer(56));
//      System.out.println(new Integer(44) + new ArrayList<>()); wrong
    }
}
