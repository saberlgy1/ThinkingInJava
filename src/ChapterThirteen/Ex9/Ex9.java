package ChapterThirteen.Ex9;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-15 21:29
 **/

public class Ex9 {
    public static String knights =
            "Then, when you have found the shrubbery, you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";
    public static void main(String[] args) {
        System.out.println(knights.replaceAll("[aeiouAEIOUw]", "_"));
    }

}
