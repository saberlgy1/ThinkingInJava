package ChapeterThirteen.SimpleFormat;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-12 20:40
 **/

public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.13213123123;
        System.out.println(x + y);
        System.out.format("%d, %f", x, y);
    }

}

