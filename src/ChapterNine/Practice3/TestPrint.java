package ChapterNine.Practice3;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-15 14:25
 **/

abstract class Test{
    public abstract void print();
    Test(){
        print();
    }
}


public class TestPrint extends Test{
    private int x = 4;

    @Override
    public void print() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        TestPrint testPrint = new TestPrint();
        testPrint.print();
    }
}
