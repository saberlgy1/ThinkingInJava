package ChapterFourteen;

/**
 * @program: ThinkingInJava
 * @description: 新的转型语法
 * @author: lgy
 * @create: 2019-04-22 14:13
 **/

class A{}

class B extends A{}

public class ClassCasts {

    public static void main(String[] args) {
        A a = new B();
        Class<B> b = B.class;
        B b1 = b.cast(a);
        b1 = (B)a;
    }
}
