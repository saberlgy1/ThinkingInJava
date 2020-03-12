package containers;

import java.util.Iterator;
import java.util.LinkedList;

import static util.Print.print;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-01-16 17:13
 **/


class SortedSet10<E> extends LinkedList<E> {

    int compare(E e1, E e2) {
        int c = e1.hashCode() - e2.hashCode();
        return Integer.compare(c, 0);
    }

    public boolean add(E e) {
        if(!this.contains(e)) {
            Iterator<E> it = this.iterator();
            int index = 0;
            while(it.hasNext()) {
                if(compare(it.next(), e) < 1)
                    index++;
            }
            add(index, e);
            return true;
        }
        return false;
    }


}

class T {}


public class Ex10 {

    public static void main(String[] args) {
        SortedSet10<T> ss = new SortedSet10<T>();
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        ss.add(new T());
        print(ss);
        SortedSet10<Integer> ss2 = new SortedSet10<Integer>();
        ss2.add(6);
        ss2.add(8);
        ss2.add(2);
        ss2.add(4);
        ss2.add(2);
        ss2.add(8);
        print(ss2);
        SortedSet10<String> ss3 = new SortedSet10<String>();
        ss3.add("three");
        ss3.add("three");
        ss3.add("seven");
        ss3.add("hi");
        ss3.add("two");
        ss3.add("one");
        print(ss3);
    }


}
