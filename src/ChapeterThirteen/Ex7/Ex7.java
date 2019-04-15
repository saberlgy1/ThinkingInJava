package ChapeterThirteen.Ex7;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-15 21:26
 **/

public class Ex7 {
    public static void main(String[] args) {
        // starts with any capital A through Z
        // then zero or more of any char except endline
        // ends with . 
        String sen = "^[A-Z].*[\\.]$";
        String s1 = "Once upon a time.";
        String s2 = "Abcd.";
        String s3 = "Abcd?";
        String s4 = "An easy way out.";
        String s5 = "Zorro.";
        String s6 = "X.";
        System.out.println(s1.matches(sen));
        System.out.println(s2.matches(sen));
        System.out.println(s3.matches(sen));
        System.out.println(s4.matches(sen));
        System.out.println(s5.matches(sen));
        System.out.println(s6.matches(sen));
    }
}
