package vaibhao;

import java.util.*;
public class PreviousArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        ListIterator li = list.listIterator(list.size());
        while(li.hasPrevious())
        {
            Object obj = li.previous();
            System.out.println(obj);
        }
    }
}
