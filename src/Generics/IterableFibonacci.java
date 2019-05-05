package Generics;

import java.util.Iterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 14:08
 **/

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
    private int n;

    public IterableFibonacci(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                return IterableFibonacci.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i:
             new IterableFibonacci(18)) {
            System.out.println(i + " ");
        }
    }
}
