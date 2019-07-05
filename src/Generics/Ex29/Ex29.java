package Generics.Ex29;

import Generics.Holder;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-17 16:16
 **/

public class Ex29 {

    static void f1(Holder<List<?>> holder) {
        System.out.println("Calling methods for the Holder: ");
        System.out.println("holder: " + holder);
        System.out.println("holder.getItem(): " + holder.getItem());
        System.out.println("Calling holder.setItem(Arrays.asList(1,2,3)");
        holder.setItem(Arrays.asList(1,2,3));
        System.out.println("holder.getItem(): " + holder.getItem());
        List<Integer> il = new ArrayList<>();
        il.add(1);
        il.add(2);
        il.add(3);
        int[] ia = {1,2,3};
        System.out.println("int[] ia = {1,2,3}");
        System.out.println("holder.equals(ia): " + holder.equals(ia));
        System.out.println("holder.equals(ia): " + holder.equals(il));
        List iaList = Arrays.asList(ia);
        System.out.println("List iaList = Arrays.asList(ia)");
        System.out.println("holder.equals(iaList): " + holder.equals(iaList));
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 1; i < 4; i++) l.add(i);
        System.out.println("l = List<Integer>() and add 1,2,3");
        System.out.println("holder.equals(l): " + holder.equals(l));
        System.out.println();

        System.out.println("Calling methods for the List: ");
        System.out.println("holder.getItem(): " + holder.getItem());
        System.out.println("holder.getItem().getClass(): " + holder.getItem().getClass());
        // Incompatible types:
        // List<? extends Integer> list = holder.getItem();
        // OK, but can't add anything:
        List<?> list = holder.getItem();
        System.out.println("list: " + list);
        // list.add(new Object());		
        List list1 = holder.getItem(); // OK, but:
        // list1.add(new Object()); // Warning: unchecked call to add(E) and
        // UnsupportedOperationException at runtime
        System.out.println("list1.getClass(): " + list1.getClass());
        System.out.println("list.equals(list1): " + list.equals(list1));
        // list.clear(); // runtime UnsupportedOperationException
        System.out.println("list.contains(1): " + list.contains(1));
        Collection<Integer> c = new HashSet<Integer>();
        for(int i = 1; i < 4; i++) c.add(i);
        System.out.println("list.containsAll(c): " + list.containsAll(c));
        System.out.println("list.equals(c): " + list.equals(c));
        System.out.println("list = " + list);
        System.out.println("c = " + c);
        System.out.println("c.getClass(): " + c.getClass()); // c is not a List
        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.hashCode() = " + list.hashCode());
        System.out.println("list.indexOf(2) = " + list.indexOf(2));
        ListIterator li = list.listIterator();
        System.out.println("After ListIterator li = list.listIterator():");
        System.out.println("li.next() = " + li.next());
        // runtime errors: UnsupportedOperationException:
        // list.remove(0);
        // list.removeAll(c);
        // list.retainAll(c1);
        // list.set(1,4); // compile error: set(int, ?) in list<?> cannot
        // be applied to (int,int)
        System.out.println("list.size() = " + list.size());
        System.out.println("list.subList(1,2) = " + list.subList(1,2));
        Object[] oa = list.toArray();
        System.out.println("After Object[] oa = list.toArray():");
        System.out.println("oa = ");
        for(Object o : oa) System.out.println(o + " ");
        System.out.println();
        // Error: runtime error ArrayStoreException:
        // Double[] da = list.toArray(new Double[3]);
        Number[] na = list.toArray(new Number[3]);
        System.out.println("After Number[] na = list.toArray(new Number[3]):");
        System.out.println("na = ");
        for(Number n : na) System.out.println(n + " ");
        System.out.println();
    }
    static void f2(List<Holder<?>> list) {

        System.out.println("Adding null member to list");
        list.add(null);
        System.out.println("list.contains(null): " + list.contains(null));
        System.out.println("list.get(0).get(): " + list.get(0));
        System.out.println("list.indexOf(null) = " + list.indexOf(null));
        System.out.println("list.isEmpty(): " + list.isEmpty());
        System.out.println("list.lastIndexOf(null) = " + list.lastIndexOf(null));
        System.out.println("Removing index 0");
        list.remove(0);
        System.out.println("Elements of list Holders: ");
        for(Holder h : list) {
            if(h == null) System.out.println("null");
            else
                System.out.println(h.getItem().getClass().getSimpleName()
                        + " " + h.getItem());
        }
        System.out.println("Removing null");
        System.out.println("Elements of list Holders: ");
        for(Holder h : list) {
            if(h == null) System.out.println("null");
            else
                System.out.println(h.getItem().getClass().getSimpleName()
                        + " " + h.getItem());
        }
        // Error: removeRange has protected access:
        // ((ArrayList)list).removeRange(0,2);
        System.out.println("list.size() = " + list.size());
        Object[] oa = list.toArray();
        System.out.println("list.toArray() = ");
        for(int i = 0; i < oa.length; i++)
            System.out.println(oa[i] + " ");
        System.out.println();
        Holder[] ha = ((ArrayList<Holder<?>>)list).toArray(new Holder[4]);
        System.out.println("(ArrayList<Holder<?>>list).toArray(new Holder[4]) = ");
        for(int i = 0; i < ha.length; i++)
            System.out.println(ha[i] + " ");
        System.out.println();
        System.out.println("Holder[4] Holders are holding: ");
        for(Holder h : ha) {
            if(h == null) System.out.println("null");
            else System.out.println(h.getItem());
        }
        System.out.println();

        System.out.println("Calling methods for the Holder: ");
        System.out.println("list = " + list);
        System.out.println("Three Holders (one null) in list:");
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == null) System.out.println("null");
            else
                System.out.println(list.get(i).getClass().getSimpleName());
        }
        list.remove(3);
        System.out.println("Holders are holding:");
        for(Holder h : list) System.out.println(h.getItem());
        Holder<?> h1 = list.get(0);
        Holder<?> h2 = list.get(1);
        Holder<?> h3 = list.get(2);
        System.out.println(list.get(0).getClass() + ": "
                + list.get(0).getClass().getSimpleName() + ", "
                + list.get(0));
        System.out.println(list.get(1).getClass() + ": "
                + list.get(1).getClass().getSimpleName() + ", "
                + list.get(1));
        System.out.println(list.get(2).getClass() + ": "
                + list.get(2).getClass().getSimpleName() + ", "
                + list.get(2));
        // Error: cannot set <?> to int or Object:
        // h3.set(5);
        // h2.set(new Object());

    }

    public static void main(String[] args) {
        String s = ";1;";
    }


}
