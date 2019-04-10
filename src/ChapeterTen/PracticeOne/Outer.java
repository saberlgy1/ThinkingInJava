package ChapeterTen.PracticeOne;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 13:45
 **/

public class Outer {
    class Inner {
        Inner() { System.out.println("Inner()"); }
    }
    Outer() { System.out.println("Outer1()"); }
    // make an Inner from within a non-static method of outer class:
    Inner makeInner() {
        return new Inner();
    }
    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.makeInner();
    }
}
