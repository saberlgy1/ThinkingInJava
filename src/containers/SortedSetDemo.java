package containers;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @program: ThinkingInJava
 * @description: 排序模式
 * @author: lgy
 * @create: 2020-01-16 09:24
 **/

public class SortedSetDemo {

    public static void main(String[] args) {
        SortedSet<String> sortedSet = new TreeSet<>();
        Collections.addAll(sortedSet, "one two three four five six seven eight".split(" "));
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        String low = sortedSet.first();
        String high = sortedSet.last();
        Iterator<String> iterable = sortedSet.iterator();
        for (int i = 0; i <= 6; i++) {
            if (i == 3) low = iterable.next();
            if (i == 6) high = iterable.next();
            else iterable.next();
        }
        System.out.println(low);
        System.out.println(high);
        System.out.println(((TreeSet<String>) sortedSet).subSet(low,high));
        System.out.println(sortedSet.headSet(high));
        System.out.println(((TreeSet<String>) sortedSet).tailSet(low));
    }


}
