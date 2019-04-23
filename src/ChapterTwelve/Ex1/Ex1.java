package ChapterTwelve.Ex1;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-28 16:13
 **/

class Exception1 extends Exception {
    public Exception1(String msg) {
        super(msg);
        System.out.println("Exception1(String msg)");
    }
}

public class Ex1 {
    public static void f() throws Exception1 {
        System.out.println("Throwing MyException from f()");
        throw new Exception1("From f()");
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception1 e) {
            System.err.println("Caught Exception1");
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Made it to finally");
    }

    }
}
