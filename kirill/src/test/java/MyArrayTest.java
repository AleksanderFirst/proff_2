import MyArrayList.MyArray;
import org.junit.Test;

import java.util.List;

public class MyArrayTest {
    @Test
    public void arrayTest() {
        List<String>  x = new MyArray<>();
        String d= "ddd";
        x.add(d);
        x.add("klolo");
        System.out.println(x.get(0) + " " + x.get(1));
        x.remove(0);
        System.out.println(x.get(0));
        System.out.println(x.size());
    }
}
