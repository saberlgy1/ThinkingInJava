package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-06 16:54
 **/

class GenericBase<T>{

    private T e;
    public void set(T arg){
        arg = e;
    }

    public T getE() {
        return e;
    }
}

class Derived<T> extends GenericBase{}

class Derived2 extends GenericBase{
};

class Derived3 extends GenericBase{};


public class EraseAndInheritance {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        Object o = d.getE();
        d.set(o);
        System.out.println(d.getE().getClass());
    }

}
