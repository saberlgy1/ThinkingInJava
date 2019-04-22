package ChapterNine.TeachNinePoingFour;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-18 15:04
 **/

public class Test {
    public static void t(Action a){
        a.fight();
    }

    public static void f(Fight f){
        f.fight();
    }

    public static void main(String[] args) {
        Adventure adventure = new Adventure();
        Action a = new Action();
        t(adventure);
        t(a);
    }
}
