package containers;

import util.Countries;

import java.util.*;

import static util.Print.print;
import static util.Print.printnb;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-12-23 15:21
 **/

public class Ex7 {

    public static void main(String[] args) {
        List<String> al = new ArrayList<String>(Countries.names(25));
        List<String> ll = new LinkedList<String>(Countries.names(25));
        print(al);
        print(ll);
        Iterator alit = al.iterator();
        Iterator llit = ll.iterator();
        while(alit.hasNext()) {
            printnb(alit.next() + (alit.hasNext() ? ", " : ""));
        }
        print();
        while(llit.hasNext()) {
            printnb(llit.next() + (llit.hasNext() ? ", " : ""));
        }
        ListIterator allit = al.listIterator();
        ListIterator lllit = ll.listIterator();
        while (lllit.hasNext()){
            allit.add(lllit.next());
            allit.next();
        }
        print(al);
        print();
        List<String> al2 = new ArrayList<String>(Countries.names(25));
        ListIterator allit2 = al2.listIterator();
        while (lllit.hasPrevious()){
            lllit.previous();
        }
        while(allit2.hasNext()) allit2.next();
        while(lllit.hasNext()) {
            allit2.add((String)lllit.next());
            allit2.previous();
            allit2.previous();
        }
        print(al2);



    }

}
