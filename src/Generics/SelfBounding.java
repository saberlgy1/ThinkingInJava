package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-25 17:12
 **/

class SelfBounded<T extends  SelfBounded<T>>{
    T e;

    public T getE() {
        return e;
    }

    SelfBounded<T> setE(T e) {
        this.e = e;
        return this;
    }
}

class A extends SelfBounded<A>{}

class B extends SelfBounded<B>{}


class C extends SelfBounded<C>{
    C setAndGet(C c){
        setE(c);
        return getE();
    }
}
class D{}

//compileError
//D 应该也有自己的边界才可以被E 继承
//class E extends SelfBounded<D>{}
public class SelfBounding {

    public static void main(String[] args) {
        A a = new A();
        a.setE(new A());
        a = a.setE(new A()).getE();
        a = a.getE();
        C c = new C();
        c = c.setAndGet(new C());
    }

}
