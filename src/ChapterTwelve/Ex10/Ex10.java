package ChapterTwelve.Ex10;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-29 17:19
 **/



class GException extends Exception {
    GException(String s) { super(s); }
}

public class Ex10 {

    static void g() throws GException {
        throw new GException("from g()");
    }


   static void f(){
        try{
            try{
                g();
            }catch (GException ge){
                System.out.println("Caught GException in f inner try");
                ge.printStackTrace();
                    throw new RuntimeException("from f(), inner try");
            }
        }catch (RuntimeException he){
            System.out.println("Caught RuntimeException in f() outer try");
            he.printStackTrace(System.out);
        }
   }
    public static void main(String[] args) {
        f();
    }
}
