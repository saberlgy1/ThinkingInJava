package ChapterTwelve.Ex2;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-28 16:39
 **/

public class Ex2 {
    public void testEx2(Ex2 ex2){
        System.out.println(ex2);
    }

    public static void main(String[] args) {
        try {
            Ex2 ex2 = null;
            ex2.testEx2(ex2);
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
