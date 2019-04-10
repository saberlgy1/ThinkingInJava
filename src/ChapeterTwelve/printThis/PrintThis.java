package ChapeterTwelve.printThis;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-01 16:34
 **/
class MyExceptionNull extends NullPointerException{}
public class PrintThis {
    public static void main(String[] args) {
        try{
            throw new MyExceptionNull();
        }
        finally{
            System.out.println("test");
        }
    }

}
