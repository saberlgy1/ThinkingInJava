package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-06 16:48
 **/
class Cat{

}

class Foo1<T>{
    T var;
}
public class Foo {

    public static void main(String[] args) {
        Foo1<Cat> cat = new Foo1<>();
        System.out.println(cat.getClass().getSimpleName());
    }

}
