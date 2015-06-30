package home_task_2;


import home_task_2.MyOwnArrayList.MyOwnArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyListTest {
    MyOwnArrayList<String> arrayList;


    @Before
    public  void init() {
        arrayList = new MyOwnArrayList<String>();
    }


    @Test
    public void ListAdd() {
        arrayList = new MyOwnArrayList<String>();
        arrayList.add("A");
        System.out.println(arrayList.get(0));
        Assert.assertEquals("A", arrayList.get(0));
    }

//    @Test
//    public void ListRemove() {
//        arrayList.add("A");
//        Assert.assertEquals("A", arrayList.get(0));
//    }
}
