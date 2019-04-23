package ChapterTwelve.Ex4;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-28 16:47
 **/

class MyException extends Exception{
    MyException(String message) {
        super(message);
        System.out.println(message);
    }
}


public class Ex4 {

    public static void test() throws MyException{
        throw new MyException("w");
    }

    public static void main(String[] args) {
        try{
            Ex4.test();
        }catch (MyException e){
            e.printStackTrace();
            System.out.println("done");
        }
    }
}
