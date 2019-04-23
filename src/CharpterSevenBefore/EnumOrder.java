package CharpterSevenBefore;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-02-27 10:26
 **/

public class EnumOrder {
    public static void main(String[] args) {
        for (Spiciness s: Spiciness.values()
             ) {
            System.out.println(s + ", ordinal" + s.ordinal());
        }
    }
}
