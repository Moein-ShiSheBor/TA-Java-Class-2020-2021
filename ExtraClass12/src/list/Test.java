package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(10);
        aList.add(12);
        aList.add(1);
        aList.add(100);
        aList.add(-1);
        System.out.println(aList);
        System.out.println(aList.size());
        System.out.println(aList.get(2));
        System.out.println(aList.isEmpty());
        System.out.println(aList.contains(10));
        Collections.sort(aList);
        System.out.println(aList);
        //
        System.out.println("- - - - - - ");
        //
        LinkedList<Integer> lList = new LinkedList<>();
        lList.add(10);
        lList.add(12);
        lList.add(1);
        lList.add(100);
        lList.add(-1);
        System.out.println(lList);
        System.out.println(lList.size());
        System.out.println(lList.get(2));
        System.out.println(lList.isEmpty());
        System.out.println(lList.contains(10));
        Collections.sort(lList);
        System.out.println(lList);
        System.out.println("--- dif ---");
        System.out.println(lList.getFirst());
        System.out.println(lList.getLast());
        System.out.println(lList.peekLast());
        System.out.println(lList.peekLast());
        System.out.println(lList.pollFirst());
        System.out.println(lList);
    }
}
