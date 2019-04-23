package ChapterTwelve.Ex6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-29 09:58
 **/


class MyEx extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    MyEx(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyEx1 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    MyEx1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}


public class Ex6 {
    static void f() throws MyEx, MyEx1 {
        throw new MyEx1();
    }
    static void g() throws MyEx1 {
        throw new MyEx1();
    }
    public static void main(String[] args) {
        try {
            f();
        } catch(Exception Oops1) {}
        try {
            g();
        } catch(Exception Oops2) {}
    }
}
