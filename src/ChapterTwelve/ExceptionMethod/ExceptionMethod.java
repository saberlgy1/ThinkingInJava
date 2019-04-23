package ChapterTwelve.ExceptionMethod;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-29 10:50
 **/

class Exc1 extends Exception{
    Exc1(){
        System.out.println("Exc1");
    }
}
class Exc2 extends Exception{
    Exc2(){
        System.out.println("Exc2");
    }
}
class Exc3 extends Exception{
    Exc3(){
        System.out.println("Exc3");
    }
}

public class ExceptionMethod {
    public static void f(int x) throws Exc1, Exc2, Exc3 {
        if(x < 0) throw new Exc1();
        if(x == 0) throw new Exc2();
        if(x > 0) throw new Exc3();
    }
    public static void main(String[] args) {
        try {
            //f(0);
            //f(1);
            f(-1);
            // will catch any Exception type:
        } catch(Exception e) {
            System.out.println("Caught Exception");
            e.printStackTrace(System.out);
        }
    }
}
