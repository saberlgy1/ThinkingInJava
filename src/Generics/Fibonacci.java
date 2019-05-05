package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 14:05
 **/

public class Fibonacci implements Generator<Integer> {


    private int count = 0;
    @Override
    public Integer next() {
        return fib(count ++);
    }
    public int fib(int n){
        if (n < 2) return 1;
        return fib(n - 2) + fib( n - 1);
    }
}
