package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-26 17:16
 **/

interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}

interface Getter extends GenericGetter<Getter>{
    Getter set();
}

public class GenericReturnTypes<T> {

    void test(Getter g){
        Getter res = g.get();
        GenericGetter gg = g.set();
    }

}
