package collection.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println("Before iterator: " + list);

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            System.out.println(it.next() + ", " + it.previousIndex() + ", " + it.nextIndex());
        }
        while (it.hasPrevious()){
            System.out.println(it.previous() + " ");
        }
        System.out.println();
        it = list.listIterator(1);
        while (it.hasNext()){
            String t = it.next();
            System.out.println(t);
            if ("ccc".equals(t)){
                it.set("nnn");
            } else {
                it.add("kkk");
            }
        }

        System.out.println("After iterator: " + list);
    }

}
