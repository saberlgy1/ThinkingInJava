package containers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-12 15:50
 **/

public class Utilities {

    static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));

    public static void main(String[] args) {
        System.out.println(list);
        System.out.println(Collections.disjoint(list, Collections.singletonList("Four")));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list, String.CASE_INSENSITIVE_ORDER));
        System.out.println(Collections.min(list, String.CASE_INSENSITIVE_ORDER));
        List<String> sublist = Arrays.asList("Four five six".split(" "));
        System.out.println(Collections.indexOfSubList(list, sublist));
        System.out.println(Collections.lastIndexOfSubList(list, sublist));
        Collections.replaceAll(list, "one", "Yo");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println(list);
        List<String> source = Arrays.asList("in the matrix".split(" "));
        Collections.copy(list, source);
        System.out.println(list);
        Collections.swap(list, 0, list.size() - 1);
        Collections.shuffle(list);
        System.out.println(list);

    }


}
