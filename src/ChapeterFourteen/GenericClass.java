package ChapeterFourteen;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-04-19 20:53
 **/

public class GenericClass {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> integerClass = int.class;
        integerClass = Integer.class;
        intClass = double.class;
        //integerClass = (int)double.class;
    }
}
