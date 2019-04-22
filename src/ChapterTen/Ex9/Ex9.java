package ChapterTen.Ex9;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-19 16:50
 **/


interface Ex9Interface {
    void say(String s);
}

public class Ex9 {
    Ex9Interface f(boolean b) {
        if(b) {
            class Inner implements Ex9Interface {
                public void say(String s) {
                    System.out.println(s);
                }
            }
            return new Inner();
        }
        return null;
    }
    public static void main(String[] args) {
        Ex9 x = new Ex9();
        int s = 1;
        boolean b = true;
        System.out.println(b);
        x.f(true).say("hi");
    }
}