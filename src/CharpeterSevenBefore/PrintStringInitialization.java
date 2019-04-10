package CharpeterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-26 15:00
 **/

class InitTest{
    InitTest(String s) {
        System.out.println("CharpeterSevenBefore.InitTest()");
        System.out.println(s);
    }
}


public class PrintStringInitialization {
    public static void main(String[] args) {
        InitTest[] it = new InitTest[5];
        for(int i = 0; i < it.length; i++)
            it[i] = new InitTest(Integer.toString(i));
    }
}
