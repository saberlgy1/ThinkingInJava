package ChapeterTen.Ex21;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-20 16:15
 **/

interface Test{

    String f();
    String g();

    public static class InnerTest{
        static void testInner(Test test) {
            test.f();
            test.g();
        }
    }
}


public class Ex21 implements Test{

    public String f(){
        System.out.println("f");
        return "f";
    }

    public String g(){
        System.out.println("g");
        return "g";
    }

    public static void main(String[] args) {
        Ex21 x = new Ex21();
        InnerTest.testInner(x);
    }


}
