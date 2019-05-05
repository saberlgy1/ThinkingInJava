package Generics.Ex7;

import Generics.Generator;

import java.util.Iterator;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 14:16
 **/

public class Fibonacci7 implements Generator<Integer>, Iterable<Integer> {

    private int count = 0;
    private int m;


    public Integer next(){
        return fib(count++);
    }

    public int fib(int n){
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public Fibonacci7(int m) {
        this.m = m;
    }

    public Fibonacci7() {
    }



    public static void main(String[] args) {
        Fibonacci7 gen = new Fibonacci7();
        for(int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
        System.out.println();
        Iterator it = new Fibonacci7(20).iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
    }


    public Iterator<Integer> iterator(){
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return m > 0;
            }

            @Override
            public Integer next() {
                m--;
                return Fibonacci7.this.next();
            }
        };
    }
}
