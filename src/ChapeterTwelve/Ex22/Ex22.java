package ChapeterTwelve.Ex22;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-03 17:11
 **/
class TestException extends Exception{}
class FailingConstructor{
    FailingConstructor() throws TestException{

    }
}

public class Ex22 {
    public static void main(String[] args) {
        try {
            FailingConstructor failingConstructor = new FailingConstructor();
        }catch (TestException e){
            System.out.println(e);
        }
    }
}
