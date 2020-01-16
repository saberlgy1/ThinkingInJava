//: containers/Lists.java
package containers; /* Added by Eclipse.py */
// Things you can do with Lists.
import util.Countries;

import java.util.*;

import static util.Print.print;
import static util.Print.printnb;

public class Listas {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;
    public static void basicTest(List<String> a) {
        a.add(1, "x"); // Add at location 1
        System.out.println(a);
        a.add("x"); // Add at end
        System.out.println(a);
        // Add a collection:
        a.addAll(Countries.names(25));
        System.out.println(a);
        // Add a collection starting at location 3:
        a.addAll(3, Countries.names(25));
        System.out.println(a);
        b = a.contains("1"); // Is it in there?
        System.out.println(b);
        // Is the entire collection in there?
        b = a.containsAll(Countries.names(25));
        System.out.println(b);
        // Lists allow random access, which is cheap
        // for ArrayList, expensive for LinkedList:
        s = a.get(1); // Get (typed) object at location 1
        System.out.println(s);
        i = a.indexOf("1"); // Tell index of object
        System.out.println(i);
        b = a.isEmpty(); // Any elements inside?
        System.out.println(b);
        it = a.iterator(); // Ordinary Iterator
        System.out.println(it);
        lit = a.listIterator(); // ListIterator
        System.out.println(lit);
        lit = a.listIterator(3); // Start at loc 3
        System.out.println(lit);
        i = a.lastIndexOf("1"); // Last match
        System.out.println(i);
        a.remove(1); // Remove location 1
        System.out.println(a);
        a.remove("3"); // Remove this object
        System.out.println(a);
        a.set(1, "y"); // Set location 1 to "y"
        System.out.println(a);
        // Keep everything that's in the argument
        // (the intersection of the two sets):
        a.retainAll(Countries.names(25));
        System.out.println(a);
        // Remove everything that's in the argument:
        a.removeAll(Countries.names(25));
        System.out.println(a);
        i = a.size(); // How big is it?
        System.out.println(i);
        a.clear(); // Remove all elements
        System.out.println(a);
    }
    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        System.out.println(b);
        b = it.hasPrevious();
        System.out.println(b);
        s = it.next();
        System.out.println(s);
        i = it.nextIndex();
        System.out.println(i);
        s = it.previous();
        System.out.println(s);
        i = it.previousIndex();
        System.out.println(i);
    }
    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        System.out.println(a);
        // Must move to an element after add():
        it.next();
        System.out.println(a);
        // Remove the element after the newly produced one:
        it.remove();
        System.out.println(a);
        // Must move to an element after remove():
        it.next();
        System.out.println(a);
        // Change the element after the deleted one:
        it.set("47");
        System.out.println(a);
    }
    public static void testVisual(List<String> a) {
        print(a);
        List<String> b = Countries.names(25);
        print("b = " + b);
        a.addAll(b);
        a.addAll(b);
        print(a);
        // Insert, remove, and replace elements
        // using a ListIterator:
        ListIterator<String> x = a.listIterator(a.size()/2);
        x.add("one");
        print(a);
        print(x.next());
        x.remove();
        print(x.next());
        x.set("47");
        print(a);
        // Traverse the list backwards:
        x = a.listIterator(a.size());
        while(x.hasPrevious())
            printnb(x.previous() + " ");
        print();
        print("testVisual finished");
    }
    // There are some things that only LinkedLists can do:
    public static void testLinkedList() {
        LinkedList<String> ll = new LinkedList<String>();
        ll.addAll(Countries.names(25));
        print(ll);
        // Treat it like a stack, pushing:
        ll.addFirst("one");
        ll.addFirst("two");
        print(ll);
        // Like "peeking" at the top of a stack:
        print(ll.getFirst());
        // Like popping a stack:
        print(ll.removeFirst());
        print(ll.removeFirst());
        // Treat it like a queue, pulling elements
        // off the tail end:
        print(ll.removeLast());
        print(ll);
    }
    public static void main(String[] args) {
        // Make and fill a new list each time:
        basicTest(
                new LinkedList<String>(Countries.names(25)));
        basicTest(
                new ArrayList<String>(Countries.names(25)));
        iterMotion(
                new LinkedList<String>(Countries.names(25)));
        iterMotion(
                new ArrayList<String>(Countries.names(25)));
        iterManipulation(
                new LinkedList<String>(Countries.names(25)));
        iterManipulation(
                new ArrayList<String>(Countries.names(25)));
        testVisual(
                new LinkedList<String>(Countries.names(25)));
        testLinkedList();
    }
} /* (Execute to see output) *///:~
