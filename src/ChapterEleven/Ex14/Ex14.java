package ChapterEleven.Ex14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-26 08:40
 **/

public class Ex14 {

    public static void addMiddle(LinkedList<Integer> l, Integer[] ia) {


        for (Integer i : ia) {
            ListIterator it = l.listIterator(l.size() / 2);
            it.add(i);
            System.out.println(l);
        }

    }

    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<Integer>();
        Integer[] x = {0, 1, 2, 3, 4, 5, 6, 7};
        Ex14.addMiddle(li, x);
    }


}
