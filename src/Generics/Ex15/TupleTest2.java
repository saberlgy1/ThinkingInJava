package Generics.Ex15;

import util.TwoTuple;

import static util.Tuple.tuple;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-05 16:23
 **/

public class TupleTest2 {

    static TwoTuple<String, Integer> f(){
        return tuple("hi", 46);
    }
    static TwoTuple f2(){
        return tuple("hi", 47);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        // compiler warning: unchecked conversion:
        TwoTuple<String,Character> ttsi2 = f2();
        System.out.println(ttsi);
        System.out.println(f2());
    }

}
