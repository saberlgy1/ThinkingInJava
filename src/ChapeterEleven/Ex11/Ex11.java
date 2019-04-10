package ChapeterEleven.Ex11;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;
import static sun.misc.Version.println;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-25 16:17
 **/

public class Ex11 {
    public static void printAny(Collection c) {
        Iterator it = c.iterator();
        while(it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> al =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        LinkedList<Character> ll =
                new LinkedList<Character>(Arrays.asList('a', 'b', 'c'));
        HashSet<Float> hs =
                new HashSet<Float>(Arrays.asList(1.1f, 2.2f, 3.3f));
        TreeSet<Double> ts =
                new TreeSet<Double>(Arrays.asList(1.11, 2.22, 3.33));
        LinkedHashSet<Integer> lhs =
                new LinkedHashSet<Integer>(Arrays.asList(11, 22, 33));
        printAny(al);
        printAny(ll);
        printAny(hs);
        printAny(ts);
        printAny(lhs);
    }
}
