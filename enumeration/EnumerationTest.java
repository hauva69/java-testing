import java.util.Enumeration;
import java.util.StringTokenizer;

public class EnumerationTest {
    public static void main(String[] args) {
        Enumeration<Object> en = new StringTokenizer("foo:bar:baz:qux", ":", false);
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}