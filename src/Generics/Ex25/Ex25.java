package Generics.Ex25;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-05-15 17:17
 **/

interface A {
}

interface B {
}

class AB<T> implements A, B {
    public String toString() {
        return "C";
    }
}

public class Ex25 {
    <T extends A> void a(T t) {
        System.out.println("a(" + t + ")");
    }

    <T extends B> void b(T t) {
        System.out.println("b(" + t + ")");
    }

    public static void main(String[] args) {
        AB a = new AB();
        Ex25 ex = new Ex25();

        ex.a(a);
        ex.b(a);
    }
}
