package ChapterTen.Ex18;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-20 15:29
 **/

public class Ex18 {
    public static class InnerClass{
        InnerClass() { System.out.println("Ex18Nest1()"); }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
    }
}
