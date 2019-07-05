package Generics.No21;

import Generics.Holder;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-17 17:07
 **/
class HolderTest<T> {

    private T item;

    public HolderTest(T item) {
        this.item = item;
    }

    public HolderTest() {
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

public class TestList {
    public static void main(String[] args) {
        List<Holder<?>> list = new ArrayList<Holder<?>>();
        Holder<Integer> h4 = new Holder<Integer>(4);
        list.add(h4);
        //System.out.println("list.contains(4): " + list.contains(4));
        System.out.println("list.contains(h4): " + list.contains(h4));
    }
}
