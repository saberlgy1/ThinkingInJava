package Generics.Ex28;

import Generics.pets.Cat;
import Generics.pets.Pet;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-16 13:38
 **/


public class Ex28 {
    class Generic1<T> {
        T t;
        void take(T t) { this.t = t; }
    }
    // note that generic type T in Generic1 is not the same as type T in Generic2
    class Generic2<T> {
        T t;
        T give() { return t; }
    }

    <T> void contra(Generic1<? super T> g1t, T t) {
        g1t.take(t);
    }
    <T> T co(Generic2<? extends T> g2t) {
        return g2t.give();
    }

    public static void main(String[] args) {
        Ex28 ex28 = new Ex28();
        Generic1<Pet> petGeneric1 = ex28.new Generic1<Pet>();
        ex28.contra(petGeneric1,new Cat("kitty"));
        System.out.println(petGeneric1);
        ex28.co(ex28.new Generic2<Pet>());
        System.out.println(ex28.co(ex28.new Generic2<Pet>()));
    }

}
