package ChapterThirteen.Concat;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-12 19:53
 **/

public class Concat {
    public static void main(String[] args) {
        String s = "abc" + "def" + 45;
        System.out.println(s);
        s = s + "4";
        System.out.println(s);
    }
}
