package ChapterThirteen.RegExp;

import java.util.Arrays;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-15 17:42
 **/

public class RegExp {
    public static String s = "" +
            "then, when you have found the shrubbery, you must " +
            "cut down the mightiest tree int the forest... " +
            "withinest... a herring";

    public static void main(String[] args) {
        System.out.println(Arrays.toString(s.split("\\W+")));

    }
}
