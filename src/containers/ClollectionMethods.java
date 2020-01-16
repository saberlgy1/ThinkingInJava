package containers;

import util.Countries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-23 09:19
 **/

public class ClollectionMethods {


    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println(array);
        System.out.println(str);
        System.out.println("max" + Collections.max(c));
        System.out.println("min" + Collections.min(c));
        Collection<String> c2 = new ArrayList<String>();
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        System.out.println(c);
        ((ArrayList<String>) c).remove(Countries.DATA[0][0]);
        System.out.println(c);
        ((ArrayList<String>) c).remove(Countries.DATA[1][0]);
        System.out.println(c);
        c.removeAll(c2);
        System.out.println(c);
        ((ArrayList<String>) c).addAll(c2);
        System.out.println(c);
        String val = Countries.DATA[3][0];
        System.out.println(c.contains(val));
        System.out.println(c.containsAll(c2));
        Collection<String> c3 = ((ArrayList<String>) c).subList(3, 5);
        c2.retainAll(c3);
        System.out.println(c2);
        c2.removeAll(c3);
        System.out.println(c2);
        c2.addAll(Countries.names(6));
        c.addAll(c2);
        System.out.println(c);
        c.clear();
        System.out.println(c);
    }


}
