package ChapeterEleven.Enviorment;

import java.util.Map;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-03-27 11:07
 **/

public class Enviorment {
    public static void main(String[] args) {
        for (Map.Entry e: System.getenv().entrySet()
             ) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
