package ChapterTen.BigEgg2;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-21 16:17
 **/


class EggTest{

    public class YolkTest{
        public YolkTest(String s){
            System.out.println(s);
        }
    }



    public EggTest(){
        System.out.println("EggTest()");
    }
    public YolkTest getYolkTest = new YolkTest("public");
    private YolkTest yolkTest = new YolkTest("private");
}

public class TestEgg extends EggTest{
    public TestEgg(){
        System.out.println("TestEgg");
    }

    public static void main(String[] args) {
        new TestEgg();
    }
}
