package ChapeterTwelve.Ex8;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-29 10:32
 **/

class MyException4 extends Exception{
    private String msg;
    MyException4(String msg) {
        super(msg);
        System.out.println("Exception4()");
        this.msg = msg;
    }
    protected void showS() {
        System.out.println("Message from Exception4: " + msg);
    }
}

class Test8 {
    public static void f() throws MyException4 {
        System.out.println("f()");
        throw new MyException4("Ouch from f()");
    }
}

public class Ex8 {
    public static void main(String[] args) {
        try {
            Test8 t = new Test8();
            t.f();
        } catch(MyException4 e) {
            System.err.println("Caught Exception4");
            e.printStackTrace();
            e.showS();
        }
    }
}
