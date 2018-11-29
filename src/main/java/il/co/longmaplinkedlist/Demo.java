package il.co.longmaplinkedlist;

import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {


//        Object[] obj = new Object[16];
//        List list = new LinkedList();
//        List list1 = new LinkedList();
//        String str = "Test";
//        String str2 = null;
//        String str3 = "Test Changed";
//        String str4 = "Test Inserted";
//        list.add(str);
//        list.add(1,str3);
//        list.add(1,str4);
//        list.remove(1);
//        System.out.println("List "+list.toString());
//        obj[0]=list;
//        list1=(LinkedList)obj[0];
//
//        for(int i=0;i<list1.size();i++){
//            str2 = (String) list1.get(i);
//            System.out.println(str2);
//        }



        long l1 = 10;
        long l2 = 1234090;
        long l3 = 23452;
        String str1 = "Boris";
        String str2 = "Anna";
        LongMapImpl<String> lm = new LongMapImpl();
        int hash1 = lm.hash(l1);
        int hash2 = lm.hash(l2);
        System.out.println(hash1+ "  " + hash2);
        String s = lm.put(l1,str1);
        String s1 = lm.put(l2,str2);
        System.out.println(s + s1);
        lm.display();
        System.out.println("It works!");
        String getStr = lm.get(l2);
        System.out.println("Get String: " + getStr);
        lm.remove(l3);
        lm.display();
        System.out.println("-----------------------");
        //lm.remove(l1);
        //lm.remove(l2);
        lm.display();
        System.out.println("isEmpty: " + lm.isEmpty());
        System.out.println("-----------------------");
        System.out.println("containsKey: " + lm.containsKey(l1));
        System.out.println("containsValue: " + lm.containsValue("Boris"));

    }
}
