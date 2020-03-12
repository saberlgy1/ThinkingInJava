package containers;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2020-03-12 14:59
 **/

public abstract class Test<C> {

    String name;

    public Test(String name) {
        this.name = name;
    }

    abstract int test(C container, TestParam tp);
}
