package ChapterEleven.Ex9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-25 16:05
 **/

public class Ex9 {
    private ArrayList<Object> items = new ArrayList<Object>();
    public void add(Object x) {
        items.add(x);
    }
    public Iterator iterator() {
        return items.iterator();
    }
    public static void main(String[] args) {
        Ex9 sequence = new Ex9();
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Iterator it = sequence.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }}
