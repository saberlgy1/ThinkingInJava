package containers;

import static jdk.nashorn.internal.objects.Global.println;
import static util.Print.print;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-24 16:14
 **/

class Link<E> {
    E e;
    Link<E> next;

    Link(E e, Link<E> next) {
        this.e = e;
        this.next = next;
    }

    Link(E e) {
        this(e, null);
    }

    public String toString() {
        if (e == null) return "null";
        return e.toString();
    }
}

class SList<E> {
    private Link<E> headLink = new Link<E>(null);

    SListIterator<E> iterator() {
        return new SListIterator<E>(headLink);
    }

    public String toString() {
        if (headLink.next == null) return "SList: []";
        print("SList: [");
        SListIterator<E> it = this.iterator();
        StringBuilder s = new StringBuilder();
        while (it.hasNext()) {
            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        return s + "]";
    }
}


class SListIterator<E> {
    Link<E> current;

    SListIterator(Link<E> link) {
        current = link;
    }

    public boolean hasNext() {
        return current.next != null;
    }

    public Link<E> next() {
        current = current.next;
        return current;
    }

    public void insert(E e) {
        current.next = new Link<>(e, current.next);
    }

    public void remove() {
        if (current != null) {
            current.next = current.next.next;
        }
    }
}

public class Ex8 {

    public static void main(String[] args) {
        SList<String> sl = new SList<String>();
        println(sl);
        SListIterator<String> slIter = sl.iterator();
        println("inserting \"hi\"");
        slIter.insert("hi");
        println(sl);
        println("inserting \"there\"");
        slIter.insert("there");
        println(sl);
        println("inserting \"sweetie\"");
        slIter.insert("sweetie");
        println(sl);
        println("inserting \"pie\"");
        slIter.insert("pie");
        println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        println("removing \"hi\"");
        slIter2.remove();
        println(sl);
        println("inserting \"hello\"");
        slIter2.insert("hello");
        println(sl);
        println("removing \"there\"");
        slIter2.remove();
        println(sl);
        println("removing \"sweetie\"");
        slIter2.remove();
        println(sl);
        println("removing \"pie\"");
        slIter2.remove();
        println(sl);
        println("removing \"hello\"");
        SListIterator slIter3 = sl.iterator();
        slIter3.remove();
        println(sl);
    }
}
