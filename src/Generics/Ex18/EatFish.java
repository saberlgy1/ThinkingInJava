package Generics.Ex18;

import Generics.Generator;
import Generics.Generators;

import java.util.*;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-06 14:30
 **/

class BigFish{
    private static long count = 1;
    private final long id = count++;
    public String toString(){
        return "BigFish" + id;
    }
    private BigFish(){

    }

    public static Generator<BigFish> generator(){
        return  new Generator<BigFish>() {
            @Override
            public BigFish next() {
                return new BigFish();
            }
        };
    }
}

class SmallFish{
    private static long count = 1;
    private final long id = count++;
    public String toString(){
        return "SmallFish" + id;
    }
    private SmallFish(){

    }
    public static Generator<SmallFish> generator = new Generator<SmallFish>() {
        @Override
        public SmallFish next() {
            return new SmallFish();
        }
    };
}



public class EatFish {

    public static void eat(BigFish b, SmallFish s){
        System.out.println(b + " ear " + s);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<SmallFish> line = new LinkedList<>();
        Generators.fill(line, SmallFish.generator, 15);
        List<BigFish> list = new ArrayList<>();
        Generators.fill(list, BigFish.generator(), 4);
        for (SmallFish s : line){
            eat(list.get(rand.nextInt(list.size())), s);
        }
    }

}
