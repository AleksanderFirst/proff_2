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
    public void sizeTest() {
        arrayList = new MyOwnArrayList<String>(5);
        Assert.assertEquals(0, arrayList.size());
    }

    @Test
    public void listAdd() {
        Assert.assertEquals(0, arrayList.size());
        arrayList.add("A");
        Assert.assertEquals(1, arrayList.size());
        Assert.assertEquals("A", arrayList.get(0));
        arrayList.set(0, "B");
        Assert.assertEquals("B", arrayList.get(0));
        arrayList.add(0, "C");
        Assert.assertEquals("C", arrayList.get(0));

    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void getOutOfIndex() {
        arrayList.get(0);
    }

    @Test
    public void ListRemove() {
        arrayList.add("A");
        Assert.assertEquals("A", arrayList.remove(0));
        Assert.assertEquals(true, arrayList.isEmpty());
    }

    @Test
    public void indexOf() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        Assert.assertEquals(1, arrayList.indexOf("B"));
    }


    @Test
    public void removeElement() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        Assert.assertEquals(true, arrayList.remove("B"));
        Assert.assertEquals("C", arrayList.get(1));
        Assert.assertEquals(false, arrayList.contains("B"));
        Assert.assertEquals(true, arrayList.contains("C"));


    }
}
