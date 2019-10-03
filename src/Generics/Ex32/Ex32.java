package Generics.Ex32;

import java.util.ArrayList;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-09 11:10
 **/

class FixedSizeStack<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    public int count() {
        return storage.size();
    }
    public void push(T item) {
        storage.add(item);
    }
    public T pop() {
        return storage.remove(storage.size() - 1);
    }
}

public class Ex32 {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        FixedSizeStack<String> strings =
                new FixedSizeStack<String>();
        for(String s : "A B C D E F G H I J".split(" "))
            strings.push(s);

        //strings.pop("0");
        int currentCount = strings.count();
        for(int i = 0; i < currentCount; i++) {
            String s = strings.pop();
            System.out.print(s + " ");
        }
    }
}
