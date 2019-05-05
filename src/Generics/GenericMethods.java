package Generics;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-01 15:09
 **/

public class GenericMethods {
    public <T, U> void f(T t, U u, String s){
        System.out.println(t.getClass().getSimpleName() + " " + u.getClass().getSimpleName() + " " + s.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        GenericMethods gen = new GenericMethods();
        gen.f(" ", "", "");
        gen.f(1 , 1, " ");
        gen.f(1.0, 10.1f, " ");
        gen.f(1.0F, 1.0, " ");
        gen.f('c', "s", " ");
        gen.f(gen, " ", "c");
    }
}
