package ChapterTwelve.CallRepeat;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-29 14:52
 **/

public class CallRepeat {
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("test");
            throw new Exception("ssss");
        }catch(Exception e){
            System.out.println("aaa");
            e.printStackTrace();
            throw e;
        }
    }
}
