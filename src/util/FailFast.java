package util;
import java.util.*;

import java.lang.reflect.Array;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-12 16:15
 **/

public class FailFast {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String> ();

        Iterator<String> it = c.iterator();
        c.add("an Object");
        try {
            String s= c.iterator().next();
            System.out.println(s);
            String s1 = it.next();

        }catch (ConcurrentModificationException e) {
            System.out.println(e);
        }

    }


}
