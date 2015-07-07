package tasks.tester;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sigen on 7/7/2015.
 */
public class TestDemo {
    List arList = getArrayList();
    List linkList = getLinkedList();
    TesterFactory factory = new TesterFactory();
    ICollectionTester arTester = factory.setTester(arList);
    ICollectionTester linkTester = factory.setTester(linkList);

    public void showTestResults() {
        StringBuffer buff = new StringBuffer();
        buff.append("Timings for insertion\n");
        buff.append(arrayListInsertTiming());
        buff.append(linkedListInsertTiming()+"\n");
        buff.append("Timings for access\n");
        buff.append(arrayListAccessTiming());
        buff.append(linkedListAccessTiming()+"\n");
        buff.append("Timings for delete\n");
        buff.append(getArrayListRemoveTiming());
        buff.append(getLinkedListRemoveTiming());

        System.out.println(buff);
    }

    public ArrayList getArrayList() {
        ArrayList al = new ArrayList();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        return al;
    }

    public LinkedList getLinkedList() {
        LinkedList al = new LinkedList();
        for (int i = 0; i < 1000000; i++) {
            al.add(i);
        }
        return al;
    }

    public StringBuffer arrayListInsertTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("ArrayList" + "\n");
        String str1 = "Insert in the end" + "\t" + "\t" + arTester.addInEndTiming(5) + "\n";
        String str2 = "Insert in the middle" + "\t" + arTester.addInMiddleTiming(5) + "\n";
        String str3 = "Insert in the start" + "\t" + "\t" + arTester.addInStartTiming(5) + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

    public StringBuffer linkedListInsertTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("LinkedList" + "\n");
        String str1 = "Insert in the end" + "\t" + "\t" + linkTester.addInEndTiming(5) + "\n";
        String str2 = "Insert in the middle" + "\t" + linkTester.addInMiddleTiming(5) + "\n";
        String str3 = "Insert in the start" + "\t" + "\t" + linkTester.addInStartTiming(5) + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

    public StringBuffer arrayListAccessTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("ArrayList" + "\n");
        String str1 = "Access from the end" + "\t" + "\t" + arTester.getFromTheEnd() + "\n";
        String str2 = "Access from the middle" + "\t" + arTester.getFromTheMiddle() + "\n";
        String str3 = "Access from the start" + "\t"   + arTester.getFromTheStart() + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

    public StringBuffer linkedListAccessTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("LinkedList" + "\n");
        String str1 = "Access from the end" + "\t" + "\t" + linkTester.getFromTheEnd() + "\n";
        String str2 = "Access from the middle" + "\t" + linkTester.getFromTheMiddle() + "\n";
        String str3 = "Access from the start" + "\t"  + linkTester.getFromTheStart() + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

    public StringBuffer getArrayListRemoveTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("ArrayList" + "\n");
        String str1 = "Remove from the end" + "\t" + "\t" + arTester.removeFromTheEnd() + "\n";
        String str2 = "Remove from the middle" + "\t" + arTester.removeFromTheMiddle() + "\n";
        String str3 = "Remove from the start" + "\t" + arTester.removeFromTheStart() + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

    public StringBuffer getLinkedListRemoveTiming() {
        StringBuffer buff = new StringBuffer();
        buff.append("LinkedList" + "\n");
        String str1 = "Remove from the end" + "\t" + "\t" + linkTester.removeFromTheEnd() + "\n";
        String str2 = "Remove from the middle" + "\t" + linkTester.removeFromTheMiddle() + "\n";
        String str3 = "Remove from the start" + "\t"  + linkTester.removeFromTheEnd() + "\n";
        buff.append(str3);
        buff.append(str2);
        buff.append(str1);
        return buff;
    }

}
