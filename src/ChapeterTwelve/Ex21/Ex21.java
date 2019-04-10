package ChapeterTwelve.Ex21;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-03 17:06
 **/
class BaseException extends Exception{};

class Base{
    Base() throws BaseException{
        throw new BaseException();
    }
}
class Test{
    Test() {
        super();
    }
}

public class Ex21{
    public static void main(String[] args) {
        try {
            Test test = new Test();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
